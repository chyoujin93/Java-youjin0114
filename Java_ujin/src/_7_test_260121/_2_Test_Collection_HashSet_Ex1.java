package _7_test_260121;

import java.util.HashSet;

public class _2_Test_Collection_HashSet_Ex1 {
    public static void main(String[] args) {
        // HashSet
        // 1. 생성
        HashSet<Integer> set = new HashSet<>();
        // 2. 추가
        set.add(10);
        set.add(20);
        set.add(30);
        // 3. 중복 안되는 부분 확인. 중복되어서 추가 안했다. (하면 true 안하면 false)
        boolean isAdded = set.add(10);
        System.out.println("10 중복 추가 여부 확인: " + isAdded);
        // 3. 수정
        // 리스트 달라서, 삭제 후 추가해야함.
        set.remove(10); //삭제
        set.add(100);   //추가


        // 4. 삭제
        System.out.println("20번 삭제함");
        set.remove(20);

        // 5. 전체 조회
        System.out.println("==== 전체 조회 ====");
        for (int num:set){
            System.out.println("반복문으로 요소 확인 해보기. : "+num);
        }

        // 6. 조회 및 검색
        // 순서가 없음. 특정 하나 선택 어려움, 왜? set.get(0) 가져올 수가 없음. 왜? 순서 없기 때문에
        // 크기 조회
        System.out.println("크기 조회: " + set.size());
        // 검색
        // contains() 이용해서 확인
        System.out.println("100 있는지 여부 확인: " + set.contains(100));
    }
}
