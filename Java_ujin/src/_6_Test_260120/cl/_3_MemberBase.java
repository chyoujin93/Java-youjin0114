package _6_Test_260120.cl;
// ● MemberBase는 부모 클래스임 - 자식클래스: NormalMember 일반 회원 클래스.

public abstract class _3_MemberBase {
    // 현재 여기 접근 지정은, 상속 받은 자식 클래스는 접근이 가능하지만,
    // 메인 클래스는 상속을 받지 않아서, 접근 불가능함.
    // 그래서, 만약 필요시, 접근 하기 위해서는 getter 라는 메서드를 작성 해야함.
    // 260120_실습4_풀이, 순서5, getter 사용하는 부분 참고해야함.
    protected String name;
    protected String email;
    // 260120_실습4_풀이, 순서2, 패스워드 변수 추가
    protected String password;
    protected int age;

    // 260120_실습4_풀이, 순서3, 생성자 수정.
//    public _3_MemberBase(String name, String email, int age) {
    public _3_MemberBase(String name, String email,String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public abstract void showInfo();
    // ★ 정보 출력용 추상 메서드
    // 이메일, 패스워드 조회 하는 기능 추가. getter (메인클래스에서 접근하기위해 getter 메서드 생성.)
    // 생성시, 우클릭 -> 생성 -> Getter -> 각각, 하나씩, email, password 선택.
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() { return age; }
    public String getName() { return name; }
}
