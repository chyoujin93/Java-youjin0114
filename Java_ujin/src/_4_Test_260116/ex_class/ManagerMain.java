package _4_Test_260116.ex_class;

public class ManagerMain {
    public static void main(String[] args) {


            // 샘플 Manager 2개 생성
            Manager m1 = new Manager("개발팀");
            Manager m2 = new Manager("인사팀");

            // 부서 출력
            m1.printDept();
            m2.printDept();
        }
    }

    //메인 클래스는 그냥 확인용임. (=출력용)
