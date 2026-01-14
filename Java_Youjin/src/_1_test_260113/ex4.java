package _1_test_260113;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("나이 : ");
        int age = scanner.nextInt();

        System.out.println("성인입니까? " + (age >= 19));


        System.out.println("점수 : ");
        int score = scanner.nextInt();

        System.out.print(score >= 60 ? "합격입니다." : "불합격입니다.");

        scanner.close();
    }
}
