package _2_test_260114.ex;

import java.util.Scanner;

public class _2_Test_Condition_if_switch_Scanner {
    public static void main(String[] args) {

        // 1. 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

        // 2. 입력 받기
        // 온도 입력 받기.
        System.out.println("온도를 입력하세요(숫자만) : ");

        // 3. 스캐너 가져오기
        int temp = scanner.nextInt();

        // 4. 출력
        // int temp = 35; // 더미 데이터 대신에, 사용자가 콘솔에서 입력 받은 데이터를 이용함. \
        // 현재는 콘솔이지만, 나중에 UI, 웹, 모바일 화면으로 대체 됨.
        if (temp > 30) {
            System.out.println("더움");
        } else if (temp <= 30 && temp >= 22) {
            System.out.println("적당함");
        } else {
            System.out.println("조금 쌀쌀함");
        }
        // 5. 스캐너 자원 반납, 1차 반납.
        // 계절 조건을 이용할 경우, 모든 작업이 끝나고, 맨마지막에 자원 반납 할 예정.
//        scanner.close();

        // 월 입력 부분
        System.out.println("월 1 ~ 12 입력하세요(숫자만) : ");
        // 스캐너 가져오기
        int month = scanner.nextInt();
        // 출력하기.
//        int month = 4;
        switch (month) {

            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("가을");
        } // switch

    } // main
} // class
