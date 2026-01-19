package _5_Test_260119.EX;

public class _2_Animal_Dog extends _2_Animal_P { // 부모클래스 상속

    @Override
    public void sound() { // 부모 sound 덮어쓰기
        System.out.println("==================");
        System.out.println("강아지: 멍멍");
    }

    public void wagTail() {
        System.out.println("(강아지가 꼬리를 흔듭니다.)");
        System.out.println("==================");
    }
}