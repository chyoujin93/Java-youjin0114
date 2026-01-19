package _4_Test_260116.ex_class;

public class _5_ParentMain_Ex {
    public static void main(String[] args) {
        // 자식 인스턴스 생성
        _5_Child_Ex child1 = new _5_Child_Ex();
        // 자식 인스턴스로 hello() 기능 호출.
        // 자식의 hello() 호출 -> super.hello() 부모꺼 호출 -> 본인의 출력물을 호출
        child1.hello();
        System.out.println("순서8,  자식 hello() 내용 호출 종료");
        System.out.println("순서9,  main() 호출 종료");

    }
}
