package _7_test_260121;

import java.util.ArrayList; // ArrayList 클래스 사용을 위한 import

public class _1_Test_Collection_ArrayList_Ex1 {
    public static void main(String[] args) {
        // 1 ArrayList
        //1) ArrayList 기본 생성 방법. 
        // ArrayList<여기는 담을 데이터의 타입지정. > list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        // <> : 다이어모든 연산자, "제너릭"라고 부름. 어떤 타입으로 배열의 구성요소를 지정할지. 정함.

        //2) 추가: list.add(추가할 데이터, 단 위의 데이터 타입에 맞는 조건)
        list.add("사과");
        list.add("바나나");
        list.add("딸기");


        // 3) 조회, list.get(해당 인덱스 번호) -> 그 인덱서 번호 위치의 값을 불러옴.
        System.out.println("=======조회===========");
        System.out.println("ArrayList<String> list의 list.get(0): " +list.get(0)); // "사과"
        System.out.println("ArrayList<String> list의 list.get(1): " +list.get(1)); // "바나나"
        System.out.println("ArrayList<String> list의 list.get(2): " +list.get(2)); // "딸기"

        // 4) 수정,list.set(수정할 인덱스 번호, 수정할 데이터);
        System.out.println("=======수정===========");
        list.set(0,"사과2");
        System.out.println("list.set(0,\"사과2\"); 수정 후 , list.get(0): " +list.get(0));

        // 5) 삭제, list.remove(삭제할 인덱스 번호,);
        list.remove(2);
//        System.out.println("list.remove(2) 삭제 후 , list.get(2): " +list.get(2));


        // 6) 전체 삭제
        list.clear();
//        System.out.println("list.clear() 전체 삭제 후 , list.get(0): " +list.get(0));

        // 7) 리스트가 비어 있는지 여부 확인.
        System.out.println("=======유효성 검사===========");
        boolean isEmpty = list.isEmpty();
        System.out.println("list의 비어 있는지 여부 확인. :" + isEmpty);

        // 전체 출력 방법. 향상된 for 문 이용.
        list.add("사과");
        list.add("바나나");
        list.add("딸기");
        list.add("apple");
        System.out.println("============================");
        System.out.println("향상된 for 문 이용 전체 출력  ");
        System.out.println("============================");
        for ( String fruit : list) {
            System.out.println("list 요소 확인 : " + fruit);
        }

        // 검색
        // 방법1, contains() 이용해서, 검색어를 받아서 검색.
        //list.contains("검색어")
        boolean check = list.contains("사과");
        System.out.println("검색 방법1,list.contains(\"사과\"): 있는지 여부 확인 :  " + check);

        // 방법2,
        // indexOf() : 앞에서부터 검색 / lastIndexOf() : 뒤에서부터 검색
        // : 데이터가 몇번째 있는지 확인.
        int appleIndex = list.indexOf("사과"); // list에서 "사과" 앞에서부터 인덱스, appleIndex 변수에 담음
        int berryIndex = list.lastIndexOf("딸기"); // list에서 "딸기" 뒤에서부터 인덱스, berryIndex 변수에 담음
        System.out.println("appleIndex 의 위치: " + appleIndex); // 사과 앞에서 0번째 위치
        System.out.println("berryIndex 의 위치: " + berryIndex); // 딸기 뒤에서 2번째 위치

        // 방법3,
        // 반복문을 이용한 조건 검색. 커스텀 검색.
        // a로 시작하는 단어 찾기.
        String foundFruit = null;
        for(String fruit :list) {
            if(fruit.startsWith("사")) {
                foundFruit = fruit;
                break;
            }
        }
        System.out.println("사로 시작하는 과일 : " + foundFruit);

        System.out.println(" ");
        System.out.println("==============실습1==============");
        System.out.println(" ");
        // 실습 1
        // 1. ArrayList<String> 생성
        // String 타입만 저장할 수 있는 ArrayList를 생성
        ArrayList<String> studentList = new ArrayList<>();

        // 2. 이름 3명 추가 (홍길동>이순신>강감찬 순서대로)
        studentList.add("홍길동");
        studentList.add("이순신");
        studentList.add("강감찬");

        // 3. 리스트의 두 번째 사람(이순신) 출력
        // 인덱스는 0부터 시작하므로 1번 **인덱스가 두 번째** 사람
        System.out.println("두 번째 사람: " + studentList.get(1));

        // 4. 리스트에서 "강감찬"을 "을지문덕"으로 **수정**
        // "강감찬"은 현재 인덱스 2번 위치
        studentList.set(2, "을지문덕");

        // 5. 리스트에서 "홍길동" **삭제**
        // 값(String)을 이용해서 해당 데이터를 삭제
        studentList.remove("홍길동");
        System.out.println("\"홍길동\" 삭제함.");

        // 6. 리스트 **크기** 출력
        // 현재 남아있는 학생 수 확인
        System.out.println("리스트의 크기(size) 출력: " + studentList.size());

        // 7. 향상된 for문을 이용한 **전체 출력**
        // 리스트에 남아있는 모든 학생 이름 출력
        System.out.println("남은 학생 목록:");
        for (String student : studentList) {
            System.out.println(student);
        }

    } // main 선언 닫기
} // _1_Test_Collection_ArrayList_Ex1 닫기
