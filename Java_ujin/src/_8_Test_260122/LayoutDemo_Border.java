package _8_Test_260122;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo_Border {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setLayout(new BorderLayout());


        frame.add(new JButton("North"), BorderLayout.NORTH);    // 위
        frame.add(new JButton("South"), BorderLayout.SOUTH);    // 아래
        frame.add(new JButton("East"), BorderLayout.EAST);      // 오른쪽
        frame.add(new JButton("West"), BorderLayout.WEST);      // 왼쪽
        frame.add(new JButton("Center"), BorderLayout.CENTER);  // 중앙


        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}