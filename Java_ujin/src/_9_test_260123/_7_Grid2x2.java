package _9_test_260123;
import javax.swing.*;
import java.awt.*;

public class _7_Grid2x2 {
    public static void main(String[] args) {
        // 컨테이너 2개 생성
        JFrame frame = new JFrame("2x2 Grid"); // 프레임


        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 20)); // 패널
        // 가로세로 간격 설정 안하면 자동으로 균등하게 설정됨

        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        panel.add(new JButton("D"));

        // 기본옵션
        frame.add(panel);
        frame.setSize(200, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
