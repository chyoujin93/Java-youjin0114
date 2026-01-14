package _2_test_260114.ex2;
import java.util.Scanner;
public class test_2 {
    public static void main(String[] args) {
//        1) 1~100까지 합
        System.out.println("====================");
        System.out.println("실습2-1");
        System.out.println("====================");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; //sum = sum + i;
        }
        System.out.println("1부터 100까지의 합: " + sum);

//        2)양수만 입력받고 음수가 입력되면 종료
        System.out.println("====================");
        System.out.println("실습2-2");
        System.out.println("====================");


        Scanner scanner = new Scanner(System.in);
        System.out.println("양수를 입력하세요(숫자만),음수 입력시 종료됩니다. : ");

        do {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("음수입력_종료");
                break;
            } else {
                System.out.println("입력한 값은 : " + num);
                System.out.println("양수를 입력하세요(숫자만),음수 입력시 종료됩니다. : ");
            }
        } while (true);


//        3)1~50사이 7의 배수만 출력, 30 넘으면 종료
        System.out.println("====================");
        System.out.println("실습2-3");
        System.out.println("====================");
        for (int i = 1; i <= 50; i++) {
            if (i > 30) {
                System.out.println("30초과시 종료합니다.");
                break; //for문 탈출
            } else if (i % 7 != 0) { //7의 배수가 아닌 경우, 다음 반복으로 진행.
                System.out.println("7의 배수가 아닙니다." + i);
                continue;
            }
            //30보다 작고, 7의 배수인 경우.
            System.out.println("출력 값: " + i);
        }
    }
}