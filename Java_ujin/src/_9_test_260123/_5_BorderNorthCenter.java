package _9_test_260123;

import javax.swing.*;
import java.awt.*;

public class _5_BorderNorthCenter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout 일부영역");

        // 라벨을 북쪽에 배치
        frame.setLayout(new BorderLayout());
        // 텍스트 area 가운데 배치
        frame.add(new JLabel("제목", SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JTextArea(5, 20), BorderLayout.CENTER);


        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}