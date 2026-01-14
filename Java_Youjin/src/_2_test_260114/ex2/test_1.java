package _2_test_260114.ex2;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
//      스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);
//      나이를 입력받아 65세 이상이면 노년층 출력
        System.out.println("실습1-1");
        System.out.println("===================================");
        System.out.println("나이를 입력하세요(숫자만) : ");
        int age = scanner.nextInt();
        if (age >= 65) {
            System.out.println("65세 이상: 노년층입니다.");
        } else {
            System.out.println("65세 미만: 젊은층입니다.");
        }
        System.out.println("===================================");

//        switch문으로 메뉴 선택
        System.out.println("실습1-2");
        System.out.println("===================================");
        System.out.println("점심 메뉴판");
        System.out.println("1.김밥 2.국밥 3.칼국수 4.국수 5.파스타");
        System.out.println("메뉴 번호를 입력하세요 : ");
        int food = scanner.nextInt();
        switch (food) {
            case 1:
                System.out.println("선택한 메뉴: 김밥");
                break;
            case 2:
                System.out.println("선택한 메뉴: 국밥");
                break;
            case 3:
                System.out.println("선택한 메뉴: 칼국수");
                break;
            case 4:
                System.out.println("선택한 메뉴: 국수");
                break;
            case 5:
                System.out.println("선택한 메뉴: 파스타");
                break;
            default:
                System.out.println("없는 메뉴 번호입니다.");
        }
        System.out.println("===================================");
        System.out.println("실습1-3");
        System.out.println("===================================");

//        점수입력
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("등급: A");
        } else if (score >= 80) {
            System.out.println("등급: B");
        } else if (score >= 70) {
            System.out.println("등급: C");
        } else if (score >= 60) {
            System.out.println("등급: D");
        } else {
            System.out.println("등급: F");
        }
        System.out.println("===================================");
        scanner.close();
    }
}