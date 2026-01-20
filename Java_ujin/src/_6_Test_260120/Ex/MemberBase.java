package _6_Test_260120.Ex;

public abstract class MemberBase {
    protected String name;
    protected String email;
    protected String password;
    protected int age; // 실습4: 로그인용

    public MemberBase(String name, String email, String password, int age){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getName() { return name; }

    public String getEmail() {
        return email;
    }

    public String getPassword() { return password; }

    public boolean checkPassword(String inputPw) {
        return password.equals(inputPw);
    }

    public int getAge() { return age; }

    public abstract  void showInfo();
}
