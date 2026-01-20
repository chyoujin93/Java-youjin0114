package _6_Test_260120.Ex;

public class NormalMember extends MemberBase implements Joinable {
    public NormalMember(String name, String email, String password, int age){
        super(name, email, password, age);
    }

    @Override
    public void join(){
        System.out.println(name + "님 회원가입 완료.");
    }

    @Override
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("비밀번호: " + password);
        System.out.println("나이: " + age);
        System.out.println("------------------");
    }
}
