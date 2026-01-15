package _2_test_260114.ex2;

import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* =========================
           1번 문제 (합계 / 평균)
        ========================= */
        int[] arr = new int[5]; //공간 5개인 빈 배열 생성
        int sum = 0;

        System.out.println("숫자 5개를 입력하세요:");
        // 입력받을 문구 작성
        // 사용자가 입력한 숫자를 스캐너를 통해 가져오고, 임시 빈 배열에 담기 -> 반복문 이용
        for (int i = 0; i < arr.length; i++) {
            // i<5 라고 쓰는 것보다 .length 를 쓰는걸 선호 (동적으로 알아서 크기를 저장하는게 더 나음)
            arr[i] = scanner.nextInt(); // 숫자를 공백 기준으로 가져오기 -> 가져오고 임시 빈 배열에 담음
            sum += arr[i]; // 각 배열의 요소들의 누적 합계를 구하기.
        }   //for문 닫기. sum 변수에 누적합계 있음

        double avg = (double) sum / arr.length; // 평균계산. 총합/배열의 갯수
        // double(실수)타입: 타입을 변경하는 캐스팅 연산자.
        // 결과 출력
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

        /* =========================
           2번 문제 (4x4 대각선)
        ========================= */
//        4*4크기의 2차원 정수 배열 생성.
        int[][] grid = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = (i == j) ? 1 : 0;
            }
        }

        System.out.println("4x4 대각선 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        /* =========================
           3번 문제 (최대값 메서드)
        ========================= */
        int[] numbers = {100, 200, 300};
        int maxValue = getMaxValue(numbers);
        System.out.println("가장 큰 값: " + maxValue);

        scanner.close();
    }

    /* =========================
       3번 문제 메서드
       정수 배열을 받아 최대값 반환
    ========================= */
    public static int getMaxValue(int[] numbers) {
        int max = numbers[0];   // 첫 번째 값을 기준값으로 설정

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
