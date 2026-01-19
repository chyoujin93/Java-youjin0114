package _5_Test_260119.EX;
    public class _2_Animal_Main {
        public static void main(String[] args) {

            // 1) Animal 타입 배열 생성
            _2_Animal_P[] aniList = new _2_Animal_P[3];

            // 2) Dog, Cat, Animal 객체를 배열에 저장 (업캐스팅)
            aniList[0] = new _2_Animal_Dog(); //자식클래스_Dog -> aniList 배열에 담음
            aniList[1] = new _2_Animal_Cat(); //자식클래스_Cat -> aniList 배열에 담음
            aniList[2] = new _2_Animal_P(); //부모클래스_P -> aniList 배열에 담음

            // 3) 반복문 + instanceof로 타입 판별, 타입에 맞는 내용 호출
            for (_2_Animal_P ani : aniList) {

                if (ani instanceof _2_Animal_Dog) {
                    _2_Animal_Dog dog = (_2_Animal_Dog) ani;   // 다운캐스팅
                    dog.sound();
                    dog.wagTail();

                } else if (ani instanceof _2_Animal_Cat) {
                    _2_Animal_Cat cat = (_2_Animal_Cat) ani;   // 다운캐스팅
                    cat.sound();
                    cat.scratch();

                } else if (ani instanceof _2_Animal_P) {
                    ani.sound();
                }
            }
        }
    }

