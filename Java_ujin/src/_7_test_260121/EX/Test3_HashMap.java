package _7_test_260121.EX;

import java.util.HashMap;

public class Test3_HashMap {
    public static void main(String[] args) {
        // 1. 생성
        // Integer: 기초 타입 정수를 -> 객체 타입으로 변환된 클래스
        // 정수를 다루는 클래스
        HashMap<String, Integer> menuMap = new HashMap<>();

        // 2. 추가 - 변수명.put(메뉴, 가격)
        menuMap.put("김밥", 3000);
        menuMap.put("라면", 4500);
        menuMap.put("떡볶이", 5000);

        // 3. 라면의 가격 조회 - 변수명.get()
        // 키로 검색해서, 값을 출력.
        System.out.println("라면의 가격 조회: " + menuMap.get("라면"+"원"));
        System.out.println("========================");

        // 4. 김밥의 가격을 3500원으로 수정 - 변수명.put( , )
        // 키가 이미 존재하면, 값을 덮어씀.
        menuMap.put("김밥", 3500);
        System.out.println("김밥 가격 변경: " + menuMap.get("김밥")+"원");
        System.out.println("========================");

        // 5. 돈까스 라는 메뉴가 있는지 확인, 결과 출력
        // 수업 풀이
        // if(컬렉션.containsKey(찾을 key){} else{}
        System.out.println("if문 사용");
        if(menuMap.containsKey("돈까스")){
            System.out.println("돈까스 메뉴가 있습니다.");
        } else {
            System.out.println("돈까스 메뉴가 없습니다.");
        }
        System.out.println("boolean 사용");
        // 유진 풀이
        // boolean 변수명 = 컬렉션.containsKey() -> T/F로 출력함.
        boolean haskey = menuMap.containsKey("돈까스");
        System.out.println("돈까스 있는지 조회: " + haskey);
        System.out.println("========================");

        // 6. 맵에 있는 모든 메뉴 이름(Key)과 가격(value) 같이 출력
        System.out.println("==========전체 출력==========");
        for(String menu : menuMap.keySet()) {
            // for(타입 임시변수 : 컬렉션.keySet())
            // keySet()은 컬렉션에 들어있는 모든 key들의 집합(Set)을 반환
        System.out.println("메뉴 : " + menu + ", 가격: " + menuMap.get(menu)+"원");
        }
    }
}
