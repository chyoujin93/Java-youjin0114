package ex_;
import java.util.Scanner;
public class test1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, n = 0;
        double sum = 0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
        while( (n = scanner.nextInt()) != 0 ) {
            sum = sum + n;
            count++;
        }
        System.out.println("수의 개수는 " + count + "개이며 ");
        System.out.println("평균은 " + sum/count + "입니다. ");
        scanner.close();


    }
}
// while문으로 입력된 정수의 평균
// (정수를 여러개 입력받고 평균을 출력, 0이 입력되면 입력을 종료)