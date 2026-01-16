package _4_Test_260116.ex_youjin;

public class test1_1 {
    public static void main(String[] args) {
        int intArray [] = new int [5];
        //배열의 크기 5개로 지정 (인덱스는 0~4까지)
        try {
            intArray[3] = 10;
            //인덱스3번에 값 추가 가능
            intArray[6] = 5;
            //인덱스6번은 없으므로 배열범위초과->예외발생
        }
        catch(ArrayIndexOutOfBoundsException e){
            //배열인덱스가 범위를 벗어났을때 발생하는 예외
            System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
        } //finally는 생략함
    }
}
