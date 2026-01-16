package _4_Test_260116.ex_class;

public class _5_Child_Ex extends _5_Parent_Ex{
    // 아무런 변수 없고,
    // 메서드도 본인게 없고, 부모꺼를 재사용 중.
    @Override // 재정의, 부모의 기능을 변경해서 사용했다고 알려주는 어노테이션.
    public void hello() {
        System.out.println("순서1, 자식 hello() 호출");
        // 부모의 메서드를 사용하겠다.
        System.out.println("순서2,  부모 super.hello() 호출 전");
        super.hello();
        System.out.println("순서5,  부모 super.hello() 호출 완료");
        System.out.println("순서6,  자식 hello() 내용 호출");
        System.out.println("안녕, 자식입니다.");
        System.out.println("순서7,  자식 hello() 내용 호출 완료");
    }
}
