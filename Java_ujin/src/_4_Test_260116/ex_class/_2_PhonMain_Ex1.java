package _4_Test_260116.ex_class;

public class _2_PhonMain_Ex1 {
        public static void main (String[]args){

            // 샘플 제품 3개 생성(등록)
            _2_Phone_Ex1 p1 = new _2_Phone_Ex1("갤럭시1", "010-1111-1111");
            _2_Phone_Ex1 p2 = new _2_Phone_Ex1("갤럭시2", "010-2222-2222");
            _2_Phone_Ex1 p3 = new _2_Phone_Ex1("갤럭시3", "010-3333-3333");

            // 샘플 제품 3개 정보 출력
//            System.out.println("=== 초기 제조사 정보 출력 ===");
            p1.printInfo();
            p2.printInfo();
            p3.printInfo();

            // 제조사 이름 변경 후 조회까지 (static 메서드)
            _2_Phone_Ex1.changeManufacturer("애플");

            _2_Phone_Ex1 p4 = new _2_Phone_Ex1("애플1", "010-1111-1111");
            _2_Phone_Ex1 p5 = new _2_Phone_Ex1("애플2", "010-2222-2222");
            _2_Phone_Ex1 p6 = new _2_Phone_Ex1("애플3", "010-3333-3333");

            //샘플 제품 3개 정보 출력
//            System.out.println("=== 제조사 변경 후 정보 출력 ===");
            p1.printInfo();
            p2.printInfo();
            p3.printInfo();
        }
    }
