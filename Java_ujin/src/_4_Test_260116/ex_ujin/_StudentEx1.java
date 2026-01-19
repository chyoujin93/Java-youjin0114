package _4_Test_260116.ex_youjin;
public class _StudentEx1 {


    String name;
    int score;

//클래스명(매개변수2개)_StudentEx1(이름,점수)
// StudentEx1을 요소로 가지는 배열 생성
//코드 생성 기능 이용_매개변수가 2개인 생성사 생성
    public _StudentEx1(String name, int score) {
        this.name = name;
        this.score = score;
    }




    //객체 배열을 반환하는 메소드 만들기
    //    메소드명 : createStudents
    //    반환타입: _1_StudentEx1

    _StudentEx1[] createStudents() {
        return new _StudentEx1[] {
                new _StudentEx1("더미학생1", 95),
                new _StudentEx1("더미학생2", 90),
                new _StudentEx1("더미학생3", 85),
        };
    }
}

