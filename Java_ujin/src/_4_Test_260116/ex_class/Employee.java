package _4_Test_260116.ex_class;
//부모클래스:Employee(직원)
public class Employee {


    // protected 멤버 변수 (접근 제어자)
    // department 부서 변수 - 자식 클래스에서 접근 가능, 외부 클래스에서는 접근 불가 = 자식한테만 물려줄 변수.
    protected String department;
    // department는 자식 클래스에 없지만,
    // 여기 부모 클래스(직원)에서 명시되었으므로 자식 클래스에서 사용 가능하다.


    // 생성자 (매개변수 1개)
    public Employee(String department) {
        this.department = department;
    }   // 직원을 만들 때, 반드시 부서를 알려줘라.


}
