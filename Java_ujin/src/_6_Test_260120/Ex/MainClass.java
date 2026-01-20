package _6_Test_260120.Ex;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        MemberBase[] members = new MemberBase[5];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=========회원관리시스템ver1.0==========");
            // 260120_실습4_풀이, 순서1
            System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 종료");
            System.out.print("메뉴선택 >> ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine()); // Interger -> Integer
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1: // 회원가입
                    if (count >= members.length) {
                        System.out.println("정원초과, 가입 불가입니다.");
                        break;
                    }

                    System.out.print("이름: ");
                    String name = sc.nextLine();

                    System.out.print("이메일: ");
                    String email = sc.nextLine();

                    System.out.print("비밀번호: ");
                    String password = sc.nextLine();

                    System.out.print("나이: ");
                    int age;
                    try {
                        age = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("나이는 숫자로 입력해주세요.");
                        break;
                    }


                    NormalMember newMember = new NormalMember(name, email, password, age);
                    members[count] = newMember;  // member/newMember 변수명 통일
                    newMember.join();
                    count++;
                    break;


                case 2: // 목록조회
                    if (count == 0) {
                        System.out.println("가입된 회원이 없습니다.");
                    } else {
                        System.out.println("\n총 회원수 : " + count + "명입니다.");
                        for (int i = 0; i < count; i++) {
                            members[i].showInfo();
                        }
                    }
                    break;


                case 3: // 로그인
                    if (count == 0) {
                        System.out.println("가입된 회원이 없습니다. 먼저 회원가입을 해주세요.");
                        break;
                    }

                    System.out.print("이메일: ");
                    String loginEmail = sc.nextLine();

                    System.out.print("비밀번호: ");
                    String loginPw = sc.nextLine();

                    // 상태변수, 로그인 성공 여부 체크 (isLogin)
                    boolean foundEmail = false;

                    // 회원 정보가 들어있는 배열을 전체 순회,
                    // 등록된 회원 숫자만큼만 반복, count 라는 변수를 활용.
                    for (int i = 0; i < count; i++) {
                        // 임시 메모리 상에 저장된 회원의 이메일과 패스워드를 확인하는 절차
                        if (members[i].getEmail().equals(loginEmail)) { // 문법/오타 수정
                            foundEmail = true;

                            if (members[i].checkPassword(loginPw)) { // 비밀번호 검사
                                System.out.println("로그인 성공");
                            } else {
                                System.out.println("정보가 불일치해서 로그인 안됩니다.");
                            }
                            break;
                        }
                    }


                    if (!foundEmail) {
                        System.out.println("정보가 불일치해서 로그인 안됩니다.");
                    }
                    break;


                case 4: // 종료  (switch 안으로 넣기)
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default: // switch 안으로 넣기
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
