package _9_test_260123.Ex;

import javax.swing.*;

public class pr4_NullLayout {
    public static void main(String[] args) {
        // 창 컨테이너 생성
        JFrame frame = new JFrame("패널 좌표배치 실습");
        frame.setLayout(null);

        // 이름 라벨
        JLabel lbl = new JLabel("이름");
        lbl.setBounds(15, 15, 50, 25);
        // 입력란1
        JTextField tf = new JTextField();
        tf.setBounds(70, 15, 100, 25);

        // 나이 라벨
        JLabel lbl2 = new JLabel("나이");
        lbl2.setBounds(15, 50, 50, 25);
        // 입력란2
        JTextField tf2 = new JTextField();
        tf2.setBounds(70, 50, 100, 25);

        // 버튼1
        JButton btn = new JButton("확인");
        btn.setBounds(110, 90, 80, 30); // (크기는 임의 지정)

        // 패널에 라벨, 텍스트필드, 버튼 추가
        frame.add(lbl); // 이름
        frame.add(tf); // 이름입력란
        frame.add(lbl2); // 나이
        frame.add(tf2); // 나이입력란
        frame.add(btn); // 확인버튼

        frame.setSize(220, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
