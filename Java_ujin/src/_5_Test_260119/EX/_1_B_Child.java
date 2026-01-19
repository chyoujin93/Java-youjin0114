package _5_Test_260119.EX;

public class _1_B_Child extends _1_A_Parent{ //★상속처리
    // 자식 클래스
    public _1_B_Child() {
        // 실습1
        // 자식 클래스 생성자 (마우스 우클릭 생성자로 만들어도 됨)
        // super()는 컴파일러가 자동으로 첫 줄에 넣지만,
        // 생성자 호출 순서를 명확히 보여주기 위해 명시 가능
    super(); //이 부분은 생략 가능. (컨트롤누르고 클릭하면 부모클래스로 이동)
        System.out.println("B 자식 클래스 생성자 실행/호출");
    }


    // 실습2
    @Override
    public void show(){
        System.out.println("B 자식 show 기능입니다. ");
    }


    // 자식 전용 메서드 (다운캐스팅 후 호출 확인용)
    public void onlyB(){
        System.out.println("B.onlyB()");
    }
}
