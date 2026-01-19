package _4_Test_260116.ex_class;

public class BankAccountMain {
    public static void main(String[] args) {
        //계좌를 개설하는 고객 3명
        //각 3명의 이름 설정
        BankAccount client1 =
                new BankAccount("고객1");
        client1.info();
        BankAccount client2 =
                new BankAccount("고객2");
        client2.info();
        BankAccount client3 =
                new BankAccount("고객3");
        client3.info();
        //전체 계좌 몇개 개설 되었는지
        //공유자원인 static으로 선언된 변수를 확인
        //static은 접근시 클래스명으로 점을 찍어서
        //메서드 변수도 똑같이 클래스명으로 접슨
        BankAccount.showInfo();

    }
}
