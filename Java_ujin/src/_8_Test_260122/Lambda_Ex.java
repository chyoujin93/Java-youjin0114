package _8_Test_260122;

import javax.swing.*;

public class Lambda_Ex {
    public static void main(String[] args) {
        JFrame frame = new JFrame("람다식 예시");
        JButton button = new JButton("Exit");

        button.addActionListener(e -> frame.dispose());

        frame.add(button);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
