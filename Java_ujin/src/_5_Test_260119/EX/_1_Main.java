package _5_Test_260119.EX;

public class _1_Main {
    // 메인 클래스 (실행)
    public static void main(String[] args) {
        System.out.println("1.업캐스팅:A타입으로 B객체 참조");
//        _1_A_Parent obj = new _1_B_Child(); //챗지피티 정답
        _1_B_Child obj = new _1_B_Child(); //위에꺼랑 실행결과 동일함. (수업풀이)



        System.out.println("2.업캐스팅 상태에서 show()호출 (오버라이딩)");
        obj.show();

        System.out.println("3.instanceof로 타입 검사 후 다운캐스팅");

        //----------------------------------------------
        // 업캐스팅 (수업용풀이)
        // [부모 타입] [참조형 변수 : p1] = new [자식 타입] ();
        _1_A_Parent p1 = new _1_B_Child();
        p1.show();
        // 부모 클래스 타입으로 객체의 show 메서드를 호출시,
        // 자식 클래스의 메서드로 호출: 가상 메서드 호출

        // 다운 캐스팅
        // if( p1 instanceof 자식타입)
        // { [자식 타입] [참조형 변수 : c1] = (자식타입) p1   }
        if(p1 instanceof _1_B_Child ) {
            _1_B_Child c1 = (_1_B_Child)p1;
            c1.show(); // 다운 캐스팅 후 기능 호출.
        }
        //----------------------------------------------
        if (obj instanceof _1_B_Child){
            _1_B_Child bObj = (_1_B_Child) obj;
            bObj.show();
            bObj.onlyB();
        } else {
            System.out.println("obj는 B 타입이 아닙니다.");
        }

        System.out.println("4.instanceof 실패 케이스 (참고)");
        _1_A_Parent justA = new _1_A_Parent();
        if (justA instanceof _1_B_Child) {
            _1_B_Child fail = (_1_B_Child) justA;
        } else {
            System.out.println("just는 B가 아니므로 다운캐스팅 불가");
        }
    }
}
