package _6_Test_260120.cl;
// ● 자식 클래스 (부모 클래스 MemberBase를 상속받은 일반 회원 클래스)

public class _3_NormalMember extends _3_MemberBase implements _3_Joinable {
    // 매개변수가 4개인 생성자
    public _3_NormalMember(String name, String email, String password ,int age) {
        super(name,email,password,age);
        // 자식 클래스라 부모 클래스 먼저 호출해야함. (부모꺼 사용해야하니까)
    }

    // Joinable 인터페이스의 메서드를 재정의(★ 부모메서드를 자식 메서드에서 오버라이딩하여 사용)
    // ★ 회원에 따라 값이 달라지기 때문에 부모클래스에서 추상메서드로 정의하였음.
    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }
    // 추상 클래스의 , 추상 메서드를 반드시 구현하기.
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age); //비밀번호는 민감정보라 출력안함.
    }
}
