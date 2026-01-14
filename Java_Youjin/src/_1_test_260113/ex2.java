import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* =========================
           1번 문제
           ========================= */
        System.out.print("오늘 저녁 먹고 싶은 메뉴? ");
        String dinnerMenu = scanner.nextLine();

        System.out.print("어디서 먹을까요? ");
        String dinnerLoc = scanner.nextLine();

        System.out.print("저녁 가격은 얼마 예상하나요? ");
        int dinnerPri = scanner.nextInt();

        System.out.println("오늘은 ["+ dinnerMenu +"][" + dinnerLoc +"]" +
                "[" + dinnerPri + "] 원입니다." );


//        /* =========================
//           2번 문제
//           ========================= */

        System.out.print("정수1 (숫자,int): ");
        int num1 = scanner.nextInt();

        System.out.print("정수2 (숫자,int): ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        double avg = (num1 + num2) / 2.0;   // 평균은 실수 처리
        System.out.println("합: " + sum + ", 평균: " + avg);
//
//        /* =========================
//           3번 문제
//           ========================= */

        System.out.print("성별(M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.println("입력한 성별은: " + gender);
        scanner.close();
    }
}
