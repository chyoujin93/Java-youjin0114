package _2_test_260114.ex2;
import java.util.Scanner;
import java.util.Arrays;
public class test_3_1 {
    //3-1. 정수 5개 입력받아 배열에 저장, 역순 출력
    public static void main(String[] args) {
        // 정수 5개 입력 받아서, 몫과 나머지를 출력
        // 스캐너 도구 이용.
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5]; // 5개의 정수 배열 생성
        System.out.println("실습3-1, 숫자를 5개 입력해주세요: ");
//        arr[0] = scanner.nextInt();
//        arr[1] = scanner.nextInt();
//        arr[2] = scanner.nextInt();
//        arr[3] = scanner.nextInt();
//        arr[4] = scanner.nextInt();
        //▽반복문으로 활용해보기
        for(int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.println("배열에서 요소 꺼내기 : " + arr[0]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[1]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[2]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[3]);
//        System.out.println("배열에서 요소 꺼내기 : " + arr[4]);
        //▽반복문으로 활용해보기
        for(int i = 4; i >= 0; i--) {
            System.out.println("배열에서 요소 꺼내기 : " + arr[i]);
        }


        scanner.close();
    }
}




