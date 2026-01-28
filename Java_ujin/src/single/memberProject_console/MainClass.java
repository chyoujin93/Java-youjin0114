package single.memberProject_console;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    private static final String FILE_NAME = "members.txt";
    public static void main(String[] args) {
        Map<String, MemberBase> members = new HashMap<>();
        loadMembers(members);
        MemberBase loggedInMember = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 2.2(검색기능추가)=======");
            if(loggedInMember != null) {
                System.out.println("-------------------------------------------");
                System.out.println("로그인 한 유저 : " + loggedInMember.getEmail());
                System.out.println("-------------------------------------------");
                System.out.println("1. 회원가입 2. 목록조회 3. 로그아웃 4. 회원수정  5. 회원검색 6. 종료");
            } else {
                System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 회원수정 5. 회원검색 6. 종료");
            }
            System.out.println("메뉴 선택 >>");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("이름: ");
                    String name = sc.nextLine();
                    System.out.println("이메일: ");
                    String email = sc.nextLine();
                    if(members.containsKey(email)) {
                        System.out.println("이미 가입된 이메일입니다.");
                        break;
                    }
                    System.out.println("패스워드: ");
                    String password = sc.nextLine();
                    System.out.println("나이: ");
                    int age = Integer.parseInt(sc.nextLine());
                    NormalMember newMember = new NormalMember(name, email, password, age);
                    members.put(email, newMember);
                    newMember.join();
                    saveMembers(members);
                    break;
                case 2:
                    if (members.isEmpty()) {
                        System.out.println("가입된 회원이 없습니다. ");
                    }
                        else {
                        for (MemberBase member: members.values()) {
                            member.showInfo();
                        }
                    }
                    break;
                case 3:
                    if(loggedInMember != null) {
                        loggedInMember = null;
                        System.out.println("로그아웃 되었습니다.");
                    } else {
                        System.out.println("\n====로그인===== ");
                        System.out.println("이메일 : ");
                        String inputEmail = sc.nextLine();
                        System.out.println("패스워드 : ");
                        String inputPassword = sc.nextLine();
                        boolean isLogin = false;
                        if(members.containsKey(inputEmail)) {
                            MemberBase member = members.get(inputEmail);
                            if(member.getEmail().equals(inputEmail) &&
                                    member.getPassword().equals(inputPassword)
                            ) {
                                System.out.println("로그인 성공!! 환영합니다.~" + member.name+ "님");
                                isLogin = true;
                                loggedInMember = member;
                            }
                            else {
                                System.out.println("패스워드가 틀렸습니다.");
                            }
                        }
                        else {
                            System.out.println("존재하지 않는 이메일입니다. ");
                        }
                    }
                    break;
                case 4:
                    if(loggedInMember == null) {
                        System.out.println("로그인 이후에 수정할 수 있습니다.");
                        break;
                    }
                    System.out.println("\n====회원 정보 수정=====");
                    System.out.println("수정할 항목을 선택하세요.");
                    System.out.println("1. 비밀번호 2. 이름 3. 나이 4. 취소 ");
                    System.out.println("입력 >>");
                    String choiceNumber = sc.nextLine();
                    boolean isUpdated = false;
                    switch (choiceNumber) {
                        case "1":
                            System.out.println("새로운 비밀번호 입력: ");
                            String newPassword = sc.nextLine();
                            loggedInMember.setPassword(newPassword);
                            isUpdated = true;
                            break;
                        case "2":
                            System.out.println("새로운 이름 입력:");
                            String newName = sc.nextLine();
                            loggedInMember.setName(newName);
                            isUpdated = true;
                            break;
                        case "3":
                            System.out.println("새로운 나이 입력:");
                            try {
                                String newAge = sc.nextLine();
                                int newAge2= Integer.parseInt(newAge);
                                loggedInMember.setAge(newAge2);
                                isUpdated = true;
                            }catch (Exception e){
                                System.out.println("잘못된 나이 입력입니다.");
                            }
                            break;
                        case "4":
                            System.out.println("수정 취소");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    if(isUpdated){
                        saveMembers(members);
                    }
                    break;
                case 5:
                    System.out.println("\n===회원 검색====");
                    System.out.println("1. 이메일(ID)로 검색 정확히 일치");
                    System.out.println("2. 이름으로 검색 (포함된 이름)");
                    System.out.println("번호 선택 >>");
                    String searchType = sc.nextLine();
                    if(searchType.equals("1")) {
                        System.out.println("검색할 이메일 입력 : ");
                        String searchEmail = sc.nextLine();
                        if(members.containsKey(searchEmail)) {
                            System.out.println("\n 검색 결과");
                            members.get(searchEmail).showInfo();
                        } else {
                            System.out.println("해당 이메일의 회원이 업습니다.");
                        }
                    } else if (searchType.equals("2")) {
                        System.out.println("검색할 이름 입력:" );
                        String searchName= sc.nextLine();
                        boolean isFound = false;
                        System.out.println("검색중....");
                        for(MemberBase m: members.values()) {
                            if(m.getName().contains(searchName)) {
                                m.showInfo();
                                isFound = true;
                            }
                        }
                        if(!isFound) {
                            System.out.println("회원을 찾을 수 없습니다. ");
                        }
                    } else {
                        System.out.println("잘못된 선택입니다.");
                    }
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다. ");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
    public static void saveMembers(Map<String, MemberBase> members){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for(MemberBase m: members.values()) {
                String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();
                bw.write(line);
                bw.newLine();
            }
            System.out.println("파일 저장 완료 " + FILE_NAME);

        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
        }finally {
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }
        }
    }
    public static int loadMembers(Map<String, MemberBase> members){
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
        }catch (IOException e){
            System.out.println("파일 불러오기 실패 원인 : " + e.getMessage());
        }finally {
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
}
