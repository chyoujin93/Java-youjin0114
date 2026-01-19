package _4_Test_260116.ex_youjin;

public class _StudentMainEx1 {
    public static void main(String[] args) {
// StudentEx1을 요소로 가지는 객체 배열 생성, 샘플학생 3명 생성, 배열에 담기
        _StudentEx1[] students = new _StudentEx1[3]; //배열3개짜리생성
        students[0] = new _StudentEx1("정국", 93);
        students[1] = new _StudentEx1("태형", 87);
        students[2] = new _StudentEx1("지민", 96);

//반복문 이용해서 출력. 학생과 학생이름 출력
        for (int i = 0; i < students.length; i++) {
            if (students[i].score >= 90) {
                System.out.println(
                        "이름: " + students[i].name +
                                ", 점수: " + students[i].score
                );
            }
        }

            System.out.println("==============================");
            System.out.println("실습2, 학생 요소를 가지는 배열을 반환하는 기능 이용. ");
            // 현재, 배열을 생성하는 기능은 _StudentEx1 클래스에 있음.
            _StudentEx1 studentEx1 = new _StudentEx1("유진", 100);
            _StudentEx1[] arr2 = studentEx1.createStudents();
            for (_StudentEx1 student : arr2) {
                if (student.score >= 90) {
                    System.out.println("이름 : " + student.name + ", 점수 : " + student.score);
                }
            }
        }
    }