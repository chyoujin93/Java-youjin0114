package _3_test_260115;
//메뉴 개발하는 클래스 (설계)
public class test3_StarCoffeeMenu {

    String menuName ;
    String size ;
    boolean isHot ;

    //메뉴만 선택
    public test3_StarCoffeeMenu(String menuName) {
        this(menuName, "Tall", true);
    }

    //메뉴+사이즈 선택
    public test3_StarCoffeeMenu(String menuName, String size) {
        this(menuName, size, true);
    }

    //메뉴+사이즈+핫여부
    public test3_StarCoffeeMenu(String menuName, String size, boolean isHot) {
        this.menuName = menuName;
        this.size = size;
        this.isHot = isHot;
    }


    // 주문 내역서 출력
    public void showMenu() {
        System.out.println("메뉴: " + this.menuName);
        System.out.println("사이즈: " + this.size );
        System.out.println("Hot?: " + this.isHot);
        System.out.println("                         ");
    }
}


