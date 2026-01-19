package _5_Test_260119.EX.Homework;

public class NormalMember extends MemberBase implements Joinable {
    public NormalMember(String name, String email, int age, String password){
        super(name, email, age, password);
    }

    @Override
    public void join(){
        System.out.println(name + "님 회원가입 완료.");
    }

    @Override
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("나이: " + age);
        System.out.println("------------------");
    }
}
