package _1_test_260113.ex;

import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 1 : ");
        int a = scanner.nextInt();

        System.out.println("정수 2 : ");
        int b = scanner.nextInt();

        System.out.println("===============================");
        System.out.println("합 : " + (a+b));
        System.out.println("평균 : " + (a+b) / 2);
        System.out.println("===============================");
        scanner.close();
    }
}
