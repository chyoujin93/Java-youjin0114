package _4_Test_260116.homework_15_16;
//실행 클래스 StarCoffeeMain
public class   test3_StarCoffeeMain {
    public static void main(String[] args) {

        test3_StarCoffeeMenu showMenu1 =
                new test3_StarCoffeeMenu("디카페인커피");
        test3_StarCoffeeMenu showMenu2 =
                new test3_StarCoffeeMenu("크림라떼", "Grande");
        test3_StarCoffeeMenu showMenu3 =
                new test3_StarCoffeeMenu("아메리카노", "tall", false);


        showMenu1.showMenu();
        showMenu2.showMenu();
        showMenu3.showMenu();
    }
}