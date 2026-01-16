package _4_Test_260116.ex_class;

//자식클래스: Manager (관리자 - 관리자도 직원이므로, 직원클래스에 종속됨)
// Employee 클래스를 부모로 한다 (직원 클래스를 상속 받는다)
public class Manager extends Employee {
    // 자식 생성자 // 생성자에서 super() 호출
    public Manager(String department) {
        super(department); // 부모 생성자 먼저 호출
        // Manager(관리자)를 만들기 전에 먼저 Employee(직원)부터 만들어야한다.
        // (같은말: 자식의 생성자에서 호출할 때, 반드시 부모 클래스 생성자를 먼저 호출해야함!
        // 왜? Employee에는 기본 생성자가 없다.
        // 그래서 자식이 이렇게 말함. "부모님(직원클래스), 이 부서 쓰세요!" super(department)
    }

    // 부서 출력 메서드 printDept()
    public void printDept() {
        // 출력 - department 부모꺼 사용
        System.out.println("소속 부서 : " + department);
    }

    // 내 변수처럼 쓰지만 실제 주인은 부모 클래스임. (직원 클래스)

    // department는 자식 클래스(관리자)에는 없지만 부모 클래스(직원)에는 있음.
    // 그런데 protected라서 자식이 직접 사용 가능 (부모클래스에도 해당내용 명시해둠)

}
