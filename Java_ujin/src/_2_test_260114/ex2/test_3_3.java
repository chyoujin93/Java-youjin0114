package _2_test_260114.ex2;
import java.util.Scanner;
public class test_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//3. 문자열 배열을 메서드로 받아 가장 긴 문자열 반환
//- 배열을 반환하는 메서드를 생성합니다.
//public static String 메서드명(String[] 배열이름)
//- 반복문을 이용해서, 배열 안에 들어 있는 문자열 중에서 가장 긴 문자열 찾아서
//배치. 배열의 길이를 이용하면. 배열. length()
        System.out.println("실습3-3");
    //함수 사용
    //준비물 1) 샘플배열(문자열을 요소로 가지는)
        String[] array = {"apple","banana","kiwi"};
        // 2) 함수사용, 사용법 -> 함수이름(인자값)
        // getLongest(array); -> 기능이, 문자열을 반환, 반환된 값을 담을 변수가 필요함.
        String result = getLongest(array);
        System.out.println("실습3-3: 가장 긴 문자열은? " + result);
    }
    //- 배열에서, 가장 긴 문자열을 반환하는 메서드를 생성합니다.
    // 순서1
    // 함수 정의! 호출x
    public static String getLongest(String[] words) {
    //샘플 배열 생성.
    //String[] words = {"apple","banana","kiwi"}
//                         5       6       4
        //순서2. 가장 긴 문자열 임시로 담을 변수 선언.
        String longest = "";

        //순서3.
        //반복문 이용해서
        for(String word: words) {
            //words라는 배열안에 문자열 요소를 순회를 돌면서 요소를 하나씩 꺼내기
             if(word.length()>longest.length()){
                 //시도1. word: apple, longest: "", 5 > 0, true, longest: apple
                 //시도2. word: banana, longest: apple, 6 > 5, true, longest: banana
                 //시도3. word: kiwi, longest: banana, 4 > 6, false, longest: banana
                 longest = word;
             }  // if 닫는 부분
        } // for 닫는 부분
        // 순서4. 반복문이 끝나면 반환하기
        return longest; // 메서드가 반환하는 문자열 의미.
    } // getLongest 메서드 닫는 부분
}