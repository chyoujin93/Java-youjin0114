package _8_Test_260122.Ex;
import javax.swing.*;
import java.awt.event.ActionListener;

public class simpleMemo {
    public static void main(String[] args) {
        // 실습2
        // "간단한 메모장" 형태의 GUI를 만들어보세요.
        // 윈도우 창, JTextArea(글 입력 창), "저장" 버튼을 포함하고,
        // "저장" 버튼을 클릭하면 입력된 내용을 콘솔에 출력하도록 하세요.
        // 힌트)
        // 이벤트 리스너의 기능:
        // sout 콘솔에 출력하기.
        // 대신에 내용을 가져오는 기능 : textArea.getText() 기능.
        // 화면 준비물 : frame, panel, button , textArea(10,30)

        // 순서1. UI 준비 (화면 준비물 생성)
        JFrame frame = new JFrame("간단한 메모장");           // 창 생성
        JPanel panel = new JPanel();                            // 패널 생성
        JTextArea textarea = new JTextArea(10,30); // 글 입력창
        JButton button = new JButton("저장");               // 저장버튼 생성

        // 순서2. UI 조립 (화면 배치)
        // 패널에 스크롤 기능의 UI(JScrollPane) 넣기.
        panel.add(new JScrollPane(textarea));
        panel.add(button);
        // 프레임에 패널 추가하고 프레임 크기, 기능설정
        frame.add(panel);                                     // 패널 추가
        frame.setSize(400, 300);                  // 창 사이즈 (가로, 세로)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 나가기 버튼
        frame.setVisible(true);                               // 화면에 나타낼지 여부

        // 순서3. 이벤트 리스너 붙이기.
        button.addActionListener(new ActionListener() {     // 익명 클래스 구현
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                 String memo = textarea.getText();          // text.getText()사용해서 memo 변수에 담기
                 System.out.println(memo);                  // memo 변수에 입력된 값 출력
                 frame.dispose();                           // 창 종료
            }
         });
    }
}