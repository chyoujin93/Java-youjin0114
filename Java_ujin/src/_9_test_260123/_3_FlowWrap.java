package _9_test_260123;

import javax.swing.*;
import java.awt.*;

public class _3_FlowWrap {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 줄바꿈");
        JPanel panel = new JPanel(new FlowLayout());

        // 패널, 프레임에 해당 버튼(UI,컴포넌트)을 붙이는 작업.
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("버튼" + i));
        }

        frame.add(panel);
        // 기본 옵션, (반복, 창 크기, 창 닫기, 창 보이기 기능)
        frame.setSize(250, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
