package _7_test_260121.EX;

import java.util.HashSet;

public class Test2_HashSet {
    public static void main(String[] args) {
        // HashSet
        // 1. 생성
        HashSet<Integer> lottoSet = new HashSet<>();
        // 2. 추가
        lottoSet.add(5);
        lottoSet.add(12);
        lottoSet.add(5);    // 중복 → 저장 안 됨
        lottoSet.add(20);
        lottoSet.add(12);   // 중복 → 저장 안 됨
        lottoSet.add(7);

        // 3. 크기 출력 (중복 제거 확인)
        // 중복된 값은 하나만 저장되므로 크기는 4가 됨
        System.out.println("==== 크기 출력 ====");
        System.out.println("저장된 숫자 개수: " + lottoSet.size());
        System.out.println("  ");

        // 4. 숫자 20 삭제
        lottoSet.remove(20);
        System.out.println("==== 숫자 20 삭제 ====");
        System.out.println("20 삭제 완료");
        System.out.println("  ");

        // 5. 숫자 5가 세트 안에 포함되어 있는데 T/F 확인, 출력
        System.out.println("==== T/F 확인 ====");
        System.out.println("숫자 5 포함 여부 " + lottoSet.contains(5));
        System.out.println("  ");

        // 6. 전체 숫자를 for 반복문으로 출력하세요
        System.out.println("==== 전체 숫자 조회 ====");
        for (int num:lottoSet){
        System.out.println("반복문으로 요소 확인 : "+num);
        }
        System.out.println("= 남은 숫자 개수: " + lottoSet.size());
    }
}
