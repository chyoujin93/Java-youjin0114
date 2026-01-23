package _9_test_260123;

import javax.swing.*;
import java.awt.*;

public class _1_FlowBasic {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout 기본");
        JPanel panel = new JPanel(new FlowLayout());

        // 패널, 프레임에 해당 버튼(UI,컴포넌트)을 붙이는 작업.

        JButton eventBtn = new JButton("이벤트 버튼");

        panel.add(new JButton("하나"));
        panel.add(new JButton("둘"));
        panel.add(new JButton("셋"));
        panel.add(eventBtn);

        // 이벤트 리스너 , 트리거 작업,
        eventBtn.addActionListener(e -> {
            System.out.println("이벤트 버튼 액션(트리거) 동작 확인. ");
        });

        frame.add(panel);

        // 기본 옵션, (반복, 창 크기, 창 닫기, 창 보이기 기능)
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
