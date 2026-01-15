package _3_test_260115;
//실행할 클래스, main 메서드 필요
public class test2_BookTest {
    public test2_BookTest() {
    }

    public static void main(String[] args) {

//        test2_Book book1 = new test2_Book();
//        book1.name = "풀꽃의 시인";
//        book1.writer = "나태주";
//        book1.price = "18,000원";

        //생성자로 입력해도 동일한 결과
        test2_Book book1 = new test2_Book("풀꽃의 시인","18,000원","나태주");

//        test2_Book book2 = new test2_Book();
//        book2.name = "데미안";
//        book2.writer = "헤르만 헤세";
//        book2.price = "15,000원";

        test2_Book book2 = new test2_Book("데미안","15,000원","헤르만 헤세");

//        test2_Book book3 = new test2_Book();
//        book3.name = "어린 왕자";
//        book3.writer = "생텍쥐페리";
//        book3.price = "12,000원";

        test2_Book book3 = new test2_Book("어린 왕자","12,000원","생텍쥐페리");

        book1.introduceBook();
        book2.introduceBook();
        book3.introduceBook();
    }
}
