package _5_Test_260119;

public class Test_AnimalMain_Ex {
    public static void main(String[] args) {
        Test_Cat_Ex cat1 = new Test_Cat_Ex();
        cat1.sound();
        //cat1은 본인 타입

        Test_Animal_Ex cat2 = new Test_Cat_Ex();
        cat2.sound();
        //cat2은 부모 타입
        //작은타입->큰타입:업캐스팅


        //타입 검사 해보기
        if (cat2 instanceof Test_Cat_Ex) {
            //큰타입->작은타입:다운캐스팅
            Test_Cat_Ex c = (Test_Cat_Ex) cat2;
            System.out.println("Cat 타입입니다.");
        }

    }
}