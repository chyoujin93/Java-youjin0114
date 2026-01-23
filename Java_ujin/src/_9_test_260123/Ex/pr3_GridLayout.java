package _9_test_260123.Ex;

import javax.swing.*;
import java.awt.*;
// 실습3
// 3*2 GridLayout,
// 각 칸에 번갈아 JLabel("항목")과
// JTextField(5글자)를 배치해서 3행 폼 만들기
public class pr3_GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3x2 Grid");
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        for (int i = 1; i < 4; i++) {
            panel.add(new JLabel("항목" + i));
            panel.add(new JTextField(5));
        }
//        반복문 아닌 직접 입력하는 방식
//        panel.add(new JLabel("항목", SwingConstants.CENTER));
//        panel.add(new JTextField(5));
//        panel.add(new JLabel("항목", SwingConstants.CENTER));
//        panel.add(new JTextField(5));
//        panel.add(new JLabel("항목", SwingConstants.CENTER));
//        panel.add(new JTextField(5));

        frame.add(panel);
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
