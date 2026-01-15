package _3_test_260115;

public class text2_ex1_person {
    public static void main(String[] args) {
        // 객체 생성 방법 :
        // [클래스명] [참조형 변수이름(객체명, 인스턴스라고 부름)] = new [클래스명]();
        text2_ex1 cyj1 = new text2_ex1();
        //복제인간 cyj1 에게 이름부여
        //연습용. 데이터에 직접 대입.
        //객체명에 "."을 붙이고 해당 속성에 접근
        cyj1.name = "최유진";

        cyj1.sayHello();


    }
}
