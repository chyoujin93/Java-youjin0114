package _8_Test_260122;
import javax.swing.*;

public class GUI_Hello_Ex {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI"); // 창 제목

        // 예시2. 버튼 추가 (frame에 버튼을 바로 붙인 상태 = 덮어씌워짐)
        JButton button = new JButton("Click Me!");  // 정가운데 버튼&텍스트 생성
        frame.add(button);

        // 예시3. 라벨 추가 (예시2번의 버튼 위에 덮어씌워짐 -> 레이어 개념 -> 마지막 작업만 보여지는 구조)
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label);

        // 프레임 사이즈, 기능 설정
        frame.setSize(300, 200); // 창 사이즈 (가로, 세로)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 나가기 버튼
        frame.setVisible(true); // 화면에 나타낼지 여부

    }
}