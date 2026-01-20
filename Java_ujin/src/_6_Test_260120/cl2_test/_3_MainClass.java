package _6_Test_260120.cl2_test;

import java.util.Scanner;

public class _3_MainClass {
    public static void main(String[] args) {
        // ● 회원가입은 count가 배열길이5개를 넘지 않는지 먼저 검사해서 정원초과를 방지
        _3_MemberBase[] members = new _3_MemberBase[5];
        int count = 0;// 현재 저장된 회원 수 (배열 인덱스 관리용)


        Scanner sc = new Scanner(System.in);

        // [추가] 현재 로그인한 유저 이메일(없으면 null)
        String loginUserEmail = null;
        // 메뉴는 반복문으로 구성. 사용자가 종료를 선택하기 전까지 계속 반복 실행됨
        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 1.0=======");
            // [추가] 메뉴 상단에 로그인 상태 표시
            // ● 아래 case3에서 설정해둔 loginUserEmail 변수 사용
            // ● 현재 어떤 사용자가 로그인되어 있는지 콘솔에서 바로 확인 가능
            if (loginUserEmail != null) {
                System.out.println("로그인한 유저 : " + loginUserEmail);
            } else {
                System.out.println("로그인한 유저 : (없음)");
            }

            System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 종료");
            System.out.println("메뉴 선택 >>");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1: // 회원 가입
                    if (count >= members.length) {
                        System.out.println("정원초과, 가입 불가입니다.");
                        break;
                    }

                    System.out.println("이름: ");
                    String name = sc.nextLine();

                    System.out.println("이메일: ");
                    String email = sc.nextLine();

                    System.out.println("패스워드: ");
                    String password = sc.nextLine();

                    System.out.println("나이: ");
                    // ● 사용자가 나이를 입력할 때 숫자가 아닌 값을 입력하면 프로그램이 에러로 종료되지 않도록 예외 처리를 한 코드
                    int age;
                    try {
                        age = Integer.parseInt(sc.nextLine()); // 콘솔에서 입력받은 값은 문자열이므로 정수로 변환하는 작업
                    } catch (NumberFormatException e) { // 문자열을 숫자로 변환할 수 없을때 발생하는 예외를 잡는 부분 (없으면 프로그램 종료됨)
                        System.out.println("나이는 숫자로 입력해주세요.");  // 에러 발생시, 사용자에게 알림문구.
                        break;  // switch문 빠져나가서 다시 메뉴 화면으로 돌아가게 함. while문 전체를 종료하지는 않으므로 프로그램은 계속 실행됨.
                    }

                    _3_NormalMember newMember = new _3_NormalMember(name, email, password, age);
                    members[count] = newMember;
                    newMember.join();
                    count++;
                    break;

                case 2: // 목록 조회
                    if (count == 0) {
                        System.out.println("가입된 회원이 없습니다. ");
                    } else {
                        System.out.println("\n 총회원수 : " + count + "명입니다.");
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

                    System.out.println("\n====로그인===== ");
                    System.out.println("이메일 : ");
                    String inputEmail = sc.nextLine();

                    System.out.println("패스워드 : ");
                    String inputPassword = sc.nextLine();

                    boolean isLogin = false;

                    for (int i = 0; i < count; i++) {
                        _3_MemberBase member = members[i];

                        // ● 문자열 비교는 equals()메서드 사용
                        if (member.getEmail().equals(inputEmail) &&
                                member.getPassword().equals(inputPassword)) {

                            System.out.println("로그인 성공!! 환영합니다.~ " + member.name + "님");
                            isLogin = true;
                            // ● 이메일과 패스워드가 모두 일치하면 로그인 성공 처리 후
                            // 로그인한 유저의 이메일을 loginUserEmail 변수에 저장
                            loginUserEmail = member.getEmail(); // [추가] 로그인 상태 저장
                            break; // [권장] 성공하면 더 이상 탐색 불필요
                        }
                    }

                    if (!isLogin) {
                        System.out.println("로그인 실패: 정보가 일치하지 않습니다. ");
                    }
                    break; // [중요] case 3 끝나면 switch 탈출 (기존 코드엔 없어서 4로 떨어짐)

                case 4: // 종료
                    System.out.println("프로그램을 종료합니다. ");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
