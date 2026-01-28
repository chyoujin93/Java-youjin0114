package single.memberProject_console;

public abstract class MemberBase {
    // 부모 클래스. 추상 클래스. -> 구현은 상속받은 자식 클래스에서 오버라이딩(재정의) 할 것임.

    protected String name;
    protected String email;
    protected String password;
    protected int age;
    // 접근제어자 설정 - 사용자의 이름, 이메일, 비밀번호, 나이는
    // 외부클래스에서 직접 접근 불가, 상속받은 자식클래스만 접근가능. (데이터안정성,보호하기위함)
    // 외부클래스도 게터와 세터를 통해 간접적으로 접근 가능

    // 참고로 자식클래스가 아니여도, 같은 패키지 내에 있다면, 접근 가능하다.
    // 딥하게 가면 포인트는 게터세터는 통로가 아니라, 검증/제한/로깅 같은 규칙을 끼워 넣는 지점.
    // 필드를 직접 만지지 못하게 하고, 메서드로만 만지게 해서 규칙을 강제한다.

    // protected는 캡슐화 완성이 아니라 타협점이다.
    // 직접 접근하지 않고 **메서드 접근**하는 이유?
    // 변경 지점을 "한 곳"으로 모을 수 있고
    // 그 안에서 **규칙/검증** 넣을 수 있다. **추적/디버깅**이 쉬워짐
    // 이건 보안 때문만이 아니라, **유지보수/오류방지** 때문이 더 크다.
    // (직접 접근시, 아무때나 어떤 값이든 들어갈 수 있어 실수 위험이 있고,
    // 어디서 값이 변경됐는지 추적도 어렵다. 또한 규칙을 강제할 수 없다.

    public MemberBase(String name, String email, String password, int age) {
        // 부모클래스에서 생성자4개 생성 (이름,이메일,패스워드,나이)
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public abstract void showInfo();
    // 부모클래스에서 추상메서드 선언
    // -> 구현은 상속받은 자식클래스에서 오버라이딩하여 재정의하여 사용한다.
    // 추상으로 둔 이유는? -> 회원 종류마다 출력 형식이 달라질 수 있으니,
    // "출력은 자식이 책임지게" 하기 위해, 추상 메서드로 두는 것이다.

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // 부모클래스는 외부에서는 접근이 불가능하다고 하였다.
    // 하지만 외부에서 접근해야할 필요가 있을 경우, 게터/세터를 통해서 접근할 수 있다.
    // 그래서 게터를 지정해준다. (좀더 딥하게 설명하자면, 검증/제한/로깅 같은 규칙
    // 게터는 객체를 조회하는 작업이다.

    // 참고로, 비밀번호는 보안상 위험하므로 출력하지 않는다.
    // 왜 위험한가? 콘솔출력도 기록(히스토리 등) 남을 수 잇고, 출력된 순간 비밀이 아니게 됨.
    // 실무에서 비밀번호 유출되면 사고급 -> 학습중 연습이라도, 올바른 습관으로 굳히는게 맞음.

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 마찬가지로 세터로 지정해준다.
    // 세터는 객체를 변경하기 위한 작업이다.

    // 현재 코드에서 강제 검증은 거의 없으나 그럼에도 게터와 세터를 쓰는 이유는
    // 미래 확장을 대비한 설계 습관 -> 지금은 단순하지만, 조금만 확장하면 바로 필요해짐



}
