package _3_test_260115;
//설계도면으로 사용할 클래스
public class test2_Book {

    String name;
    String price;
    String writer;

    //매개변수가 3개인 생성자 생성
    public test2_Book(String name, String price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    // 책소개 메서드
    void  introduceBook() {
        System.out.println("책 이름: " + this.name);
        System.out.println("작가: " + this.writer );
        System.out.println("가격: " + this.price);
        System.out.println("                    ");
    }
}

