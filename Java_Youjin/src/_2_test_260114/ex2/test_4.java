package _2_test_260114.ex2;

import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* =========================
           1번 문제 (합계 / 평균)
        ========================= */
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("숫자 5개를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);

        /* =========================
           2번 문제 (4x4 대각선)
        ========================= */
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
