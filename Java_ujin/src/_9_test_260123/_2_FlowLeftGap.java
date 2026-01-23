package _9_test_260123;

import javax.swing.*;
import java.awt.*;

public class _2_FlowLeftGap {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 왼쪽정렬+간격");
        // 왼쪽 정렬, 수평 간격 :20 px, 수직 간격 : 30 px
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 30));

        // 패널, 프레임에 해당 버튼(UI,컴포넌트)을 붙이는 작업.
        panel.add(new JButton("A"));
        panel.add(new JButton("B"));
        panel.add(new JButton("C"));
        frame.add(panel);
        // 기본 옵션, (반복, 창 크기, 창 닫기, 창 보이기 기능)
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
