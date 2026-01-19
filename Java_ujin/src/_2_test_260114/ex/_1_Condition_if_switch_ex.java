package _2_test_260114.ex;

public class _1_Condition_if_switch_ex {
    public static void main(String[] args) {
        int temp = 35;
        if (temp > 30) {
            System.out.println("더움");
        }

        int month = 4;
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            default:
                System.out.println("기타 계절");
        }
    }
}
