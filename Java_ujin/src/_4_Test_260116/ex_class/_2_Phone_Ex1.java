package _4_Test_260116.ex_class;
public class _2_Phone_Ex1 {

    private static String manufacturer = "삼성";

    //static 공유 멤버
    //접근 지정자: private
    //인스턴스 멤버 - 모델, 폰넘버 (둘 다 string)
    private String model;
    private String phoneNumber;

    //매개변수가 2개인 생성자
    public _2_Phone_Ex1(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    //인스턴스 정보를 출력할 메서드 하나 필요 - printInfo()
    public void printInfo() {
        System.out.println("제조사 : " + _2_Phone_Ex1.manufacturer);
        System.out.println("모델명 : " + model);
        System.out.println("폰번호 : " + phoneNumber);
        System.out.println("---------------------");
    }
    //인텔리제이에서 전체 검색 방법 1)shift 2번 누르면 검색창 열림

    //static 메서드 생성 후,
    //제조사 이름을 변경하는 메서드 만들기 - changeManufacturer()
    public static void changeManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }
}
