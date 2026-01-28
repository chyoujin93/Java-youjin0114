package single.memberProject_console;
// 노멀멤버 자식클래스 -> 멤버베이스 부모클래스를 상속했음, 조이너블 인터페이스를 여기서 구현할 것임.
public class NormalMember extends MemberBase implements Joinable {

    // 노멀멤버 자식클래스=자식객체는 부모의 필드/기능을 상속받아 포함하며
    // 생성시 부모 생성자를 통해 공통 필드를 초기화한다.
    public NormalMember(String name, String email, String password, int age) {
        // 자식생성자는 항상 부모생성자를 먼저 호출해야 상속받은 필드가 먼저 초기화된다.
        super(name,email,password,age);
    }

    // 인터페이스를 여기서 implements했으니 반드시 구현해야한다.
    // 오버라이딩: 부모/인터페이스에 선언된 메서드를 자식에서 같은 이름/매개변수로 다시 정의하는 것
    @Override
    // 인터페이스에서 선언만 되었던 join()을 반드시 구현한다. -> 회원가입완료 메세지
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }
    // 이게 가능한 이유는 name이 protected라서 자식이 직접 접근 가능하기 때문.
    // 만약 private였다면 getName()으로 써야 함.
    // showInfo()도 동일.

    // 부모클래스를 여기서 extends하여 상속받았기 때문에
    // 부모클래스에서 선언만 되었던 showInfo()를 반드시 구현한다.
    // 회원의 종류마다 출력값이 달라지기 때문에 자식클래스에서 책임지고, 오버라이딩(재정의) 하는 것임.
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age);
        // 비밀번호는 보안상 위험하므로 절대 출력하지 않는다.
        // 출력하는 순간 비밀이 아니게 되며, 기록이 남아 문제가 될 수 있다.
        // 실무에서 매우 중요, 학습 연습시에도 습관 형성.
    }
}

// (참고) 실무식으로 한 단계 더 가면
// protected 대신 private로 바꾸고,
// 자식에서 getName() 같은 getter를 통해 출력하게 만들면
// 캡슐화가 더 강해진다.
// 지금은 학습단계라 난이도 낮은 protected 사용.

