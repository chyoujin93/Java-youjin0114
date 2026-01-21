package _7_test_260121;

import java.util.HashMap;

public class _3_Test_Collection_HashMap_Ex1 {
    public static void main(String[] args) {
        // 1. 생성
        HashMap<String, Integer> map = new HashMap<>();
        // 2. 추가
        map.put("user1", 90);
        map.put("user2", 85);
        map.put("user3", 100);
        // 3. 하나 조회
        // 키로 검색해서, 값을 출력.
        System.out.println("map.get(\"user2\") 하나 조회: " + map.get("user2"));
        // 4. 수정
        // 키가 이미 존재하면, 값을 덮어씀.
        // user2의 점수를 변경. 90으로.
        map.put("user2", 90);
        System.out.println("map.put(\"user2\") 수정후 조회: " + map.get("user2"));
        // 5. 삭제
        System.out.println("user2번 삭제함");
        map.remove("user2");
        System.out.println("user2번 삭제후 조회" + map.get("user2"));
        // 6. 검색
        boolean hasKey = map.containsKey("user1");
        System.out.println("키로 검색 map.containsKey(\"user1\") 결과: " + hasKey);
        // 값으로 검색.
        boolean hasValue = map.containsValue(100);
        System.out.println("값으로 검색 map.containsKey(100) 결과: " + hasValue);
        // 7. 전체 조회
        // 방법1. 키들만 뽑아서 전체 조회 -> 가장 많이 사용함
        System.out.println("전체출력");
        for(String key : map.keySet()) {
            System.out.println("키 : " + key + ", 값: " + map.get(key));
        }
        // 방법2. 값들만 뽑아서 반복
        for(int num : map.values()) {
            System.out.println("값들만 뽑아서 출력 반복 : " + num);
        }
    }
}
