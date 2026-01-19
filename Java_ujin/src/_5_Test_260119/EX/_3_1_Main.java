package _5_Test_260119.EX;
// 추상 클래스
public class _3_1_Main {
    public static void main(String[] args) {

        _3_1_Shape circle = new _3_1_Circle();
        circle.draw();

        _3_1_Shape rectangle = new _3_1_Rectangle();
        rectangle.draw();

        _3_1_Shape oval = new _3_1_Oval();
        oval.draw();

    }
}
