package _3_test_260115;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        System.out.println("입력한 숫자: " + num);
    } catch (Exception e) {
        System.out.println("문자를 입력해서 종료합니다.");
        // ▼오류가 발생한 이력을 조사 할 수 있다.
        e.printStackTrace();
    } finally {
        scanner.close();
    }
    }
}


//실습1
//숫자 입력 예외 처리,
//사용자가 문자를 입력했을 때 예외 처리
//        (스캐너 도구를 이용하고, 숫자를 가져와서 사용하는 구조이고,
//         거기에 사용자가, 문자를 입력했을 때 처리하는 경우)
//
//힌트) try-catch` 구문을 이용하기.
//예외처리 방식 1) 큰범위로 합니다.
//        catch (Exception e) {