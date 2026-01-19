package _5_Test_260119.EX.Homework;

public abstract class MemberBase {
    protected String name;
    protected String email;
    protected int age;
    protected String password; // 실습4: 로그인용

    public MemberBase(String name, String email, int age, String password){
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String inputPw) {
        return password.equals(inputPw);
    }

    public abstract  void showInfo();
}
