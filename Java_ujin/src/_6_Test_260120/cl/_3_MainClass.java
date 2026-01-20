package _6_Test_260120.cl;

import _6_Test_260120.cl._3_MemberBase;
import _6_Test_260120.cl._3_NormalMember;
import java.io.*;
import java.util.Scanner;

public class _3_MainClass {

    //====================================================================
    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서1
    // 우리가 저장할 파일의 이름 미리 지정
    private static final String FILE_NAME = "members.txt";
    //====================================================================
    public static void main(String[] args) {


        //----------------------------------------------------------------
        // ★ 최대 5명까지 저장 가능한 배열을 만들어서, 회원가입시 정원초과됨을 방지
        _3_MemberBase[] members = new _3_MemberBase[5];
        // ★ 회원가입 후, 가입된 총 회원 수를 나타내기위해, count 변수를 사용 (배열 인덱스 관리용으로도 사용됨)
        int count = 0;
        // ★ 마지막에 count++(1씩더해서)해서 다음 회원이 저장될 인덱스로 이동

        // 로그인한_유저_표기추가, 순서4
        count = loadMembers(members);

        // 로그인한_유저_표기추가, 순서1
        // 현재 로그인한 회원을 저장할 변수 loggedInMember를 만들고 초기갓 null로 설정
        // 로그인 후, 로그인한 유저로 값을 채울 예정.
        _3_MemberBase loggedInMember = null;
        // 로그인한 회원의 실제 타입이 무엇이든, 공통으로 다뤄야 하기 때문에
        // 부모타입(클래스)으로 변수를 선언합니다.
        // (나중에 로그인 성공하면 MemberBase를 상속받은 어떤 회원 객체든 이 변수에 담겠다.)
        // 부모타입으로 변수선언하고 자식객체를 담는 방식의 이유는?
        // : 다형성을 활용한 구조임. 다른회원타입이 생겼을때를 대비하기위함. 부모를 상속한 어떤 객체든 담을 수 있음. (유연,확장가능한구조)
        // : 자식타입으로 선언하게되면 확장범위가 좁아져서 나중에 변수타입을 바꿔야하는 문제가 생김


        //----------------------------------------------------------------
        //  콘솔에 입력 내용 불러오는 도구.
        Scanner sc = new Scanner(System.in);
        // ★ 스캐너로 이름, 이메일, 비밀번호, 나이를 입력받고,
        // ★ case1에서 nomalmember 자식 객체를 생성후, members[count] 배열에 저장.

        //----------------------------------------------------------------
        // 메뉴 반복문 이용해서 그려보기.
        while (true) {
            System.out.println("\n=============회원 관리 시스템 ver 1.0=======");

            // 260120_실습4_풀이_로그인한_유저_표기추가, 순서2
            // 로그인한 유저가 있다면, 여기에 화면에 표시하기.
            if(loggedInMember != null) {
                System.out.println("-------------------------------------------");
                System.out.println("로그인 한 유저 : " + loggedInMember.getEmail());
                System.out.println("-------------------------------------------");
            }

            // 260120_실습4_풀이, 순서1, 메뉴 변경,
            // System.out.println("1. 회원가입 2. 목록조회 3. 종료");
            System.out.println("1. 회원가입 2. 목록조회 3. 로그인 4. 종료");
            System.out.println("메뉴 선택 >>");

            // 숫자를 입력 받을 준비 및 처리.
            int choice;
            try {
                // 콘솔에 입력된 내용은 모두 타입이 문자열입니다.
                // 그래서, 입력 받은 문자열을 숫자 형태로 변경해야함.
                // Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                // 콘솔에 숫자가 아닌 다른 문자등을 입력시에는, 반복문이
                // 종료되지 않고, 계속 동작 하게끔 설정.
                continue;
            }

            // ★ switch~case문은 하나의 변수 값에 따라, 실행할 코드를 **분기 처리**하는 조건문
            // ★ 사용자가 선택한 메뉴 번호에 따라 가입, 조회, 로그인, 종료하는 기능을 각각 다른 case에서 처리.
            // ★ 메뉴처럼 선택값이 명확한 경우, 여러개의 if else보다 switch case가 가독성이 좋음.
            switch (choice) {

                // 회원 가입-----------------------------------------------------------------------
                case 1:
                    // count , 현재 가입된 회원의 숫자,
                    // members 배열의 길이가 5로 고정이므로, count >= members.length로 정원초과를 방지함
                    // count(정수 변수)는 현재 가입된 회원 수이자 다음 저장 인덱스 역할을 함
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
                    // 문자열 -> 숫자 타입으로 변경 : (콘솔입력은 문자열이므로 숫자로 변환해야함)
                    //Integer.parseInt : 문자열 -> 숫자로 타입 변경 해주는 기능.
                    int age = Integer.parseInt(sc.nextLine());
                    // -----------------------------------------------------------------------------
                    // ★ 다형성 활용 : 부모 타입 배열에, 자식 객체 저장.
                    _3_NormalMember newMember = new _3_NormalMember(name, email, password, age);
                    // ★ 배열에 저장.
                    members[count] = newMember;
                    // ★ 인터페이스 메서드 호출 (★ 회원가입 완료 메시지 출력)
                    newMember.join();
                    // ★ 가입완료 후,
                    // ★ 현재 가입한 인원 증가시켜서 다음 저장 위치로 인덱스 이동
                    count++;


                        //===============================================================
                        // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서3
                        // 회원가입시, 메모리상의 내용을 파일에 저장하는 메서드를 이용하자.
                        saveMembers(members, count);
                        break;
                        //===============================================================

                //목록 조회-----------------------------------------------------------------------
                case 2:
                    // ★ count변수가 0인지 확인해서, 가입된 회원이 없는 경우를 먼저 처리
                    if (count == 0) {
                        System.out.println("가입된 회원이 없습니다. ");
                    } else {
                        // ★ 가입된 회원이 1명 이상 있으면, 현재 가입된 회원수를 출력하고,
                        System.out.println("\n 총회원수 : " + count + "명입니다.");
                        // ★ for반복문을 사용해서 실제로 회원이 저장된 구간인
                        // 0부터 count 전까지만 순회합니다.
                        for (int i = 0; i < count; i++) {
                            members[i].showInfo();
                            // 그리고 각 회원 객체에 대해 showInfo()메서드를 호출해서
                            // 회원정보를 출력합니다.
                            // (다형성 적용: 자식객체 NormalMembers 에서 오버라이딩한 메서드가 실행됨)
                            // members배열은 부모타입인 MemberBase 배열이지만, 실제로 들어있는 객체는
                            // 자식 클래스인 NormalMember 객체입니다.
                        }
                    }
                    break;


                //로그인-----------------------------------------------------------------------
                case 3:
                    // 순서대로 확인하기.
                    System.out.println("\n====로그인===== ");
                    // ★ 이메일, 패스워드를 입력받고,
                    // ★ 이메일로 유저를 찾고 패스워드도 저장된 값과 비교하고 일치하면 로그인 성공
                    // ★ 아니면, 로그인 실패
                    System.out.println("이메일 : ");
                    String inputEmail = sc.nextLine();
                    System.out.println("패스워드 : ");
                    String inputPassword = sc.nextLine();
                    // 상태 변수, 로그인 성공 여부 체크
                    boolean isLogin = false;
                    // 회원 정보가 들어 있는 배열을 전체 순회,
                    // count 변수에 저장된 회원 숫자 만큼만 반복
                    for (int i = 0; i < count; i++) {
                        // 임시 메모리 상에 저장된 회원의 이메일과 패스워드 확인하는 절차!
                        // for반복문으로 count[]에 저장된 회원 한명씩 꺼내서, member 에 담아두고,
                        // 입력된 이메일과 패스와드 vs 저장된 이메일과 패스워드 =? 일치 여부 확인
                        _3_MemberBase member = members[i];
                        // ★ 주의사항! 문자열 비교시에는 == 가 아니라 equals() 메서드로 값을 비교한다.
                        // 문자열1.equals(문자열2) => 같으면, true, 다르면, false
                        // member.getEmail() : 문자열1
                        // inputEmail : 문자열2
                        // 숫자 비교
                        // 1 == 2 :  false
                        if(member.getEmail().equals(inputEmail) &&
                                member.getPassword().equals(inputPassword)
                        ) {
                            System.out.println("로그인 성공!! 환영합니다~" + member.getName()+ "님");
                            isLogin = true;

                            // ★ 로그인 성공시 해당 로그인한 객체를 loggedInMember 변수에 저장.
                            loggedInMember = member;
                            break;
                        } // if 닫기
                    } // for 닫기.

                    // ★ 로그인 실패인 경우,
                    if(!isLogin) { // false
                        System.out.println("로그인 실패: 정보가 일치하지 않습니다. ");
                    }
                    break;


                //종료-----------------------------------------------------------------------
                case 4:
                    System.out.println("프로그램을 종료합니다. ");
                    // 스캐너 자원 반납
                    sc.close();
                    return; // 메인 메서드 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            } //switch 닫기
        }//while 닫기
    } // main 닫기






    //===================================================================================
    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서2
    // 1) 저장하는 기능의 메서드 만들기, 정적(static)
    // 준비물 : 1) 메모리상에 저장된 멤버들의 배열 members , 2) 가입된 인원수 count
    public static void saveMembers(_3_MemberBase[] members, int count){
        // BufferedWriter : 버퍼를 사용해 파일 쓰기 속도를 높여줍니다.
        BufferedWriter bw = null;
        // try ~ catch ~ finally, 1) 파일 입출력 2) 네트워크 통신이럴 경우, 반드시 의무적으로
        // try 구문안에 작성해야함.
        try {
            // 스트림 생성.
            // new FileWriter(FILE_NAME) : 우리가 지정한 파일에 쓰겠다. 기록 하겠다.
            // new BufferedWriter (여기 ) : "여기"라는 내용을 좀더 빠르게 쓰겠다.
            bw = new BufferedWriter(new FileWriter(FILE_NAME));

            // members[i] 배열이고, 메모리상에 저장된 멤버들
            // 반복문을 이용해서, 메모리상에 저장된 멤버들을, members.txt 파일에 기록하는 과정.
            for(int i = 0; i < count; i++) {
                _3_MemberBase m = members[i];

                // 받아온 데이터 정보를 확인
                System.out.println("디버깅1 넘어온 데이터 확인 : " + m.getName());

                // 파일에 저장 형식 : 이름,이메일,패스워드,나이 (구분자: 쉼표로 구분, csv)
                // 기존 _3_MemberBase 클래스, 이메일과, 패스워드 만 읽을수 있는데,
                // 여기서, 추가로, 이름, 나이도 같이 조회하게 기능 추가.
                // _3_MemberBase 클래스 이동해서, getter 생성, 이름과, 나이 추가.

                String line = m.getName()+","+m.getEmail()+","+m.getPassword()+","+m.getAge();
                System.out.println("디버깅2 넘어온 데이터 확인2 line : " + line);
                // 파일에 한줄씩 기록 하겠다.
                bw.write(line);
                bw.newLine(); // 줄바꿈 함.
            }
            System.out.println("파일 저장 완료 " + FILE_NAME);

        } catch (IOException e){
            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
        }finally {
            // 에러가 있든 ,없든 무조건 실행 되는 구간.
            // 자원 반납,  bw 기능 반납하기.
            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }
        }
    }

    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서3
    //    2) 불러오는 기능의 메서드 만들기, 정적(static)
    // 준비물 : 1) 메모리에 저장된 배열, members
    public static int loadMembers(_3_MemberBase[] members){
        // 물리 파일 : FILE_NAME = members.txt 파일에 접근하고, 가져오는 기능을 담당하는 클래스를 이용.
        // 담당 클래스 : File
        // 스캐너 도구를 사용 하듯이,
        // 파일 도구를 이용하기.
        File file = new File(FILE_NAME);

        // 유효성, 파일 무조건 있다는 보장이 없음. 그래서, 안전 장치 달기.
        // 파일이 없다면, 해당 기능 실행을 중지.
        if(!file.exists()) { // 해당 파일이 존재 안하니? true(파일없다)
            return 0;
        }

        // 실제 불러올 멤버의 숫자(상태 변수)
        int loadCount = 0;

        // 버퍼를 이용해서 빠르게 불러오기, 도구를 사용하기.
        BufferedReader br = null;

        // 실험장에서 작업하기. 왜? 파일을 읽고, 쓰는 작업 여기서 하기로 약속 했음
        // 만약 안하면? 그러면 실행 안해줘!!!!
        // 파일 읽기/쓰기는 예외가 발생할 수 있으므로 try-catch-finally로 처리한다.
        // finally에서 자원을 반납한다 close()
        try {
            // new FileReader(file) : 물리 파일 읽는 도구
            // new BufferedReader : 빨리 읽어주는 도구.
            // br : 파일에서 읽었던 내용이 모두 br 에 들어가 있음(내용물)

        br = new BufferedReader(new FileReader(file));

        // 파일에서 읽어온 내용을 한줄씩 임의로 담아둘 변수.
        String line;
        // br.readLine(), : 전체 내용중에서, 한줄 읽기.
        while ((line = br.readLine()) != null ) {
            // 유효성 기본 체크, 읽을 때, 배열의 크기 이상을 읽지 못하게 막기.
            // 예시) loadCount : 4, members : 회원 가입된 인원 3명
            // 못 불러옴. 그래서 오류가 나니까, 미연에 방지하자.
            if(loadCount >= members.length) {
                break;
            }
            // 정상적으로 불러오는 경우
            // 쉼표를 기준으로 데이터를 불러오기.
            // 예시) line = "이상용,lsy@naver.com,1234,20"
            // split -> 문자열.split(","), 콤마를 기준으로 단어를 분리함.
            // String[] data = { "이상용", "lsy@naver.com",  "1234", "20"
            String[] data = line.split(",");
            if(data.length == 4) {
                String name = data[0];
                String email = data[1];
                String password = data[2];
                int age = Integer.parseInt(data[3]);

                // 파일에서 읽어온 내용을 -> 메모리 상의 배열에 담기.
                members[loadCount] = new _3_NormalMember(name, email, password, age);
                loadCount++;

            }
        }
            System.out.println("파일 불러오기 완료 : " + loadCount + "명의 회원 정보를 불러옴.");
    } catch (IOException e) {
            System.out.println("파일 불러오기 실패 : " + e.getMessage());
    } finally {
        // 자원 반납. 읽어오는 도구 자원반납, 스캐너 다 사용 후 반납하듯이
        if ( br != null ) {
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("파일 닫기 실패");
        }
        }
        } // finally 닫기
        return loadCount;
    }
} // _3_MainClass 닫기

