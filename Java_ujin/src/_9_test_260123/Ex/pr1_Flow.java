package _9_test_260123.Ex;

// 자바 자체 문법이 아닌, swing 라이브러리 클래스를 사용할거라 import로 불러와야 함.
// 자바에서 기본 제공해주는 표준 GUI 라이브러리 클래스임.
import javax.swing.*;
import java.awt.*;

public class pr1_Flow {
    public static void main(String[] args) {
        // 실습1
        JFrame frame = new JFrame("FlowLayout 기본"); // 프레임 생성
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 패널 생성
        JTextField textField = new JTextField(8);   // 텍스트필드(8글자) 생성

        panel.add(new JLabel("이름"));    // 패널에 라벨 추가
        panel.add(textField);   // 패널에 텍스트필드 추가

        // JButton("검색") 따로 객체를 생성해서, 즉 이름을 부여해서 재사용.
        // 이벤트 리스너에 사용해야함.
        JButton searchBtn = new JButton("검색");  // searchBtn 검색버튼 생성
        panel.add(searchBtn);   // 패널에 추가

        // 검색버튼에 이벤트 적용 (swing라이브러리 메서드 + 자바 표준 라이브러리 인터페이스, 자바 람다식 문법)
        searchBtn.addActionListener(e -> {
            // 텍스트 필드에 입력된 값 가져오기. (일반 자바 문법)
            String inputText = textField.getText(); // 텍스트필드에 입력된 값을 뽑아서, 변수에 대입
            System.out.println("입력된 내용 : " + inputText); // 담아진 변수를 출력한다.
        });

        // 만든 UI화면에 나타내기.
        frame.add(panel);   // 프레임에 패널을 붙인다.
        // 기본 옵션 (창 크기, 기능 설정)
        frame.setSize(300, 200); // 창 사이즈 (가로, 세로)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 나가기 버튼
        frame.setVisible(true); // 프레임 보일지 말지 여부

    }
}
