package _9_test_260123.Ex;


import javax.swing.*;
import java.awt.*;

public class pr2_BorderLayout {
    public static void main(String[] args) {
    // 실습2
    // BorderLayout의 각 영역(NORTH, SOUTH, EAST, WEST, CENTER)에
    // 모두 다른 컴포넌트(버튼, 라벨, 텍스트필드 등)를 배치해보세요.
    // - 북 : 라벨 , 헤더
    // - 남 : 버튼, 확인
    // - 동 : 텍스트필드 , 입력
    // - 서 : JCheckBox , 선택
    // - 중앙 : JTextArea(4,12) 정도,
    // 크기 , 가로 350, 높이 180
    // 기본옵션 사용.
        JFrame frame = new JFrame("BorderLayout 실습2"); // 프레임 생성
        frame.setLayout(new BorderLayout(10,10)); // 레이아웃 생성
        // gap 설정 없으면 기능적으로는 의미 없으나, 초보단계에서는 개념학습용으로 명확하게함
        // JPanel은 기본이 FlowLayout이라서 여기서 습관 안들이면 나중에 헷갈림.
        // 레이아웃이 핵심이거나 협업/유지보수에도 명시하는것이 좋고, JPanel 사용시에는 반드시 명시해야한다.

        frame.add(new JLabel("헤더"), BorderLayout.NORTH); // 북_라벨
        frame.add(new JButton("확인"), BorderLayout.SOUTH); // 남_버튼
        frame.add(new JTextField("입력",8), BorderLayout.EAST); // 동_텍스트필드
        frame.add(new JCheckBox("선택"), BorderLayout.WEST); // 서_체크박스
        frame.add(new JTextArea(4,12), BorderLayout.CENTER); // 중앙_텍스트area

        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
