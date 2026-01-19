package _5_Test_260119.EX;

public class _2_Animal_Cat extends _2_Animal_P { // 부모클래스 상속

    @Override
    public void sound() { // 부모 sound 덮어쓰기
        System.out.println("고양이: 야옹");
    }

    public void scratch() {
        System.out.println("고양이가 발톱을 세웁니다.");
        System.out.println("==================");
    }
}