package _2_test_260114.ex;
import java.util.Scanner;
public class _1_Condition_if_switch_ex2 {
    public static void main(String[] args) {
        //1.스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);
        //2.입력받기
        //온도 입력 받기
        System.out.println("온도를 입력하세요(숫자만) :");
        //3.스캐너 가져오기
        int temp = scanner.nextInt();
        //4.출력
        if (temp>30) {
            System.out.println("더움");
        }else if (temp<=30 && temp>=22){
            System.out.println("적당함");
        }else {
            System.out.println("조금 쌀쌀함");
        }
        //5.스캐너 자원 반납, 1차 반납
        //계절 조건 이용할 경우, 모든 작업이 끝나고, 맨마지막 자원 반납 예정

        //월 입력 부분
        System.out.println("월1~12 입력하세요(숫자만) :");
        //스캐너 가져오기
        int month = scanner.nextInt();
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 12: case 1: case 2:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
    }
    }
}
