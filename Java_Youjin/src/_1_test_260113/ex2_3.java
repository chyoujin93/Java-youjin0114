import java.util.Scanner;

public class ex2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("성별(M/F) :");
        char gender = scanner.next().charAt(0);

        System.out.println("입력한 성별 : " + gender);
        scanner.close();
    }
}