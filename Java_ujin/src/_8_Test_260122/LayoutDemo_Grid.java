package _8_Test_260122;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo_Grid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo");
        JPanel panel = new JPanel();


        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));


        frame.add(panel);


        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}