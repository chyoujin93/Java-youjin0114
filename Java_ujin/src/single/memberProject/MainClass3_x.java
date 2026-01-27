// 주석 제거, 혼자 연습하려고 만든 패키지
package single.memberProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
// 메인클래스_GUI_흐름 담당
// : 화면담당, 버튼 누르면 무슨 기능 실행할지, 연결하는 파일임.

public class MainClass3_x extends JFrame {
    // Main클래스에 JFrame을 상속시킴.
    private static final String FILE_NAME = "members.txt";
    private Map<String, MemberBase> members = new HashMap<>();
    private MemberBase loggedInMember = null;
    private JTextArea displayArea;
    private JPanel buttonPanel;
    private JLabel statusLabel;
    private JButton btnJoin, btnList, btnLoginLogout,
                    btnEdit, btnSearch, btnDelete, btnExit;

    public static void main(String[] args) {
        // 메인 메서드 선언
        SwingUtilities.invokeLater(() -> {
            // GUI 관련 코드 :
            new MainClass3_x();
        });
    }

    public MainClass3_x() {
    super("회원 관리 시스템 ver 3.2(GUI)버전");
        loadMembers(members);
        initUI();

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void initUI() {
        setLayout(new BorderLayout());

        statusLabel = new JLabel("로그인 상태 : 로그아웃 됨", SwingConstants.CENTER);
        statusLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 0));
        add(statusLabel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3, 5, 5));

        btnJoin = new JButton("1. 회원가입");
        btnList = new JButton("2. 목록조회");
        btnLoginLogout = new JButton("3. 로그인");
        btnEdit = new JButton("4. 회원수정");
        btnSearch = new JButton("5. 회원검색");
        btnDelete = new JButton("6. 회원탈퇴");
        btnExit = new JButton("7. 종료");

        btnList.addActionListener(new ActionHandler());
        btnJoin.addActionListener(new ActionHandler());
        btnLoginLogout.addActionListener(new ActionHandler());
        btnEdit.addActionListener(new ActionHandler());
        btnSearch.addActionListener(new ActionHandler());
        btnDelete.addActionListener(new ActionHandler());
        btnExit.addActionListener(new ActionHandler());

        buttonPanel.add(btnJoin);
        buttonPanel.add(btnList);
        buttonPanel.add(btnLoginLogout);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnExit);

        add(buttonPanel, BorderLayout.SOUTH);
        updateButtonState();
    }

    private class ActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == btnJoin) {
                handleJoin();
            } else if (source == btnList) {
                handleList();
            } else if (source == btnLoginLogout) {
                handleLoginLogout();
            } else if (source == btnEdit) {
                    handleEdit();
            } else if (source == btnSearch) {
                    handleSearch();
            } else if (source == btnDelete) {
                handleDelete();
            } else if (source == btnExit) {
                System.exit(0);
            }
        }
    }
    private void printLog(String msg) {
        displayArea.append(msg + "\n");
        displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }
    private void handleJoin() {
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JTextField ageField = new JTextField();

        Object[] message = {
                "이름 : ", nameField,
                "이메일 : ", emailField,
                "비밀번호 : ", passField,
                "나이 : ", ageField
        };

        int option = JOptionPane.showConfirmDialog
                (this, message, "회원가입", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String ageStr = ageField.getText();

            if (members.containsKey(email)) {
                // 통째로 이용하기, 자바 버전의 경고창(alert())
                JOptionPane.showMessageDialog(this, "이미 가입된 이메일입니다.");
                // 중복시, 메서드 나가기.
                return;
            }

            try {
                int age = Integer.parseInt(ageStr);
                NormalMember newMember = new NormalMember(name, email, pass, age);
                members.put(email, newMember);
                saveMembers(members);
                printLog("회원 가입 완료 : " + email);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "나이는 숫자만 입력하세요.");
            }
        }
    }

    // 2. 목록조회
    private void handleList() {
        displayArea.setText("");
        printLog("===회원 목록===");
        if (members.isEmpty()) {
            printLog("가입된 회원이 없습니다.");
        } else {
            for (MemberBase member : members.values()) {
                String info = String.format("이름 : %s | 이메일 : %s | 나이 : %d",
                        member.getName(), member.getEmail(), member.getAge());
                // 문자열 포맷팅
                printLog(info);
            }
        }
    }

    // 3. 로그인/로그아웃 기능
    private void handleLoginLogout() {
        System.out.println("hangleLoginLogout 메서드안");
        if (loggedInMember != null) {
            loggedInMember = null;
            printLog(">>>>로그아웃 되었습니다.");
            updateButtonState();

        } else {
            JTextField emailField = new JTextField();
            JPasswordField passField = new JPasswordField();
            Object[] message = {
                    "이메일:", emailField,
                    "패스워드:", passField
            };

            int option = JOptionPane.showConfirmDialog
                    (this, message, "로그인", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                String inputEmail = emailField.getText();
                String inputPassword = passField.getText();
                if (members.containsKey(inputEmail)) {
                    MemberBase member = members.get(inputEmail);
                    if (member.getPassword().equals(inputPassword)) {
                        loggedInMember = member;
                        printLog(">>>로그인 성공!! " + member.getName() + "님 환영합니다.");
                        updateButtonState();
                    } else {
                        JOptionPane.showMessageDialog
                        (this, "패스워드가 틀렸습니다.");
                    }
                } else {
                    JOptionPane.showMessageDialog
                    (this, "존재하지않는 이메일입니다..");
                }
            }
        }
    }

    // 4. 회원정보수정 기능
        private void handleEdit() {
            if (loggedInMember == null) { JOptionPane.showMessageDialog
                    (this, "로그인 후 이용해주세요.");
                return;
            }
            String[] options = {"비밀번호", "이름", "나이"};
            int choice = JOptionPane.showOptionDialog(
                    this,
                    "수정할 항목 선택해주세요.",
                    "회원정보변경",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            if (choice == -1) {
                return;
            }

            String newValue = JOptionPane.showInputDialog
                    (this, "새로운 값을 입력하세요:");
            if (newValue == null) {
                return;
            }

            boolean isUpdated = false;

            switch (choice) {
                case 0: // 비밀번호 변경
                    loggedInMember.setPassword(newValue);
                    isUpdated = true;
                    break;
                case 1: // 이름 변경
                    loggedInMember.setName(newValue);
                    isUpdated = true;
                    break;
                case 2:
                    try {
                        int newAge = Integer.parseInt(newValue);
                        loggedInMember.setAge(newAge);
                        isUpdated = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "잘못된 나이 입력입니다.");
                    }
                    break;
            }

            if(isUpdated) {
                saveMembers(members);
                printLog(">>> 정보가 수정되었습니다.");
                updateButtonState();
            }
        }

        // 로그인, 로그아웃 기능 동작시, 버튼 패널
        private void updateButtonState () {
            if(loggedInMember != null) {
                statusLabel.setText
                        ("로그인 중 : " + loggedInMember.getEmail() + "(" + loggedInMember.getName() + ")");
                btnLoginLogout.setText("3. 로그아웃");
                btnEdit.setEnabled(true);
                btnSearch.setEnabled(true);
                btnList.setEnabled(true);

            } else {
                statusLabel.setText("로그인 상태 : 로그아웃 됨");
                btnLoginLogout.setText(("3. 로그인"));
                btnEdit.setEnabled(false);
                btnSearch.setEnabled(true);
                btnList.setEnabled(true);
            }
        }

    // 5. 회원 검색
    private void handleSearch() {
        String[] options = {"이메일 검색", "이름으로 검색"};
        int choice = JOptionPane.showOptionDialog(
                this,
                "검색할 항목 선택해주세요.",
                "회원 검색", // 타이틀 제목바
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == -1) {
            return;
        }

        String keyword = JOptionPane.showInputDialog
                (this, "검색어를 입력하세요:");

        if (keyword == null || keyword.trim().isEmpty()) {
            return;
        }

        displayArea.setText("");
        printLog(">>> 검색 결과 : " + keyword + "~~");

        boolean isFound = false;

        if (choice == 0) {
            if (members.containsKey(keyword)) {
                MemberBase member = members.get(keyword);
                printLog("검색결과 : " + member.getName() + ", 이메일 : " + member.getEmail());
                isFound = true;
            }

        } else {
            for (MemberBase member : members.values()) {
                if (member.getName().contains(keyword)) {
                    printLog("검색결과 : " + member.getName() + ", 이메일 : " + member.getEmail());
                    isFound = true;
                }
            }
        }
        if(!isFound){
            printLog("검색결과가 없습니다.");
        }
    }

    // 6. 회원탈퇴
    private void handleDelete() {
        if (loggedInMember == null) {
            JOptionPane.showMessageDialog
                    (this, "로그인 후 본인 탈퇴 가능합니다.");
            return;
        }

        int response = JOptionPane.showConfirmDialog
                (this,
                        "정말로 회원 탈퇴를 하시겠습니까? \n 모든 정보가 삭제됩니다.",
                        "회원 탈퇴 확인",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

        if (response == JOptionPane.YES_OPTION) {
            String inputPassword = JOptionPane.showInputDialog
                    (this, "비밀번호를 입력하세요: ");

            if (inputPassword != null && inputPassword.equals(loggedInMember.getPassword())) {
                String targetEmail = loggedInMember.getEmail();
                members.remove(targetEmail);

                saveMembers(members);

                printLog(">>> 회원탈퇴완료: " + targetEmail);
                loggedInMember = null;
                updateButtonState();

                JOptionPane.showMessageDialog
                        (this, "탈퇴 처리가 완료되었습니다. 이용해주셔서 감사합니다.");
            } else if (inputPassword != null) {
                JOptionPane.showMessageDialog
                        (this, "비밀번호가 일치하지 않습니다.");
            }
        }
    }

    public void saveMembers(Map<String, MemberBase> members){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for(MemberBase m: members.values()) {
                String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();
                bw.write(line);
                bw.newLine(); // 줄바꿈 함.
            }
        } catch (IOException e){
        printLog ("오류발생 : " + e.getMessage());
        } finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }
        }
    }

    public int loadMembers(Map<String, MemberBase> members) {
        File file = new File(FILE_NAME);
        if(!file.exists()) {
            return 0;
        }
        int loadCount = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null ) {
                String[] data = line.split(",");
                if( data.length == 4) {
                    String name = data[0];
                    String email = data[1];
                    String password = data[2];
                    int age = Integer.parseInt(data[3]);
                    members.put(email,new NormalMember(name,email,password,age));
                    loadCount++;
                }
            }
            System.out.println("파일 불러오기 완료 :" + loadCount + "명의 회원 정보를 불러옴.");
        }
            catch (IOException e){
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        }
            finally {
            if( br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("파일 닫기 실패");
                }
            }
        }
        return loadCount;
    }




} // MainClass3_x 닫기
