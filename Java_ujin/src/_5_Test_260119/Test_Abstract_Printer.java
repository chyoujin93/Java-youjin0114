package _5_Test_260119;


//추상 클래스 1)객체 생성 2)구성품은 추상 메서드로 구성됨
public class Test_Abstract_Printer extends Test_Abstract_Machine{

    @Override
    void operate() {
        System.out.println("프린터 작동");
    }
}
