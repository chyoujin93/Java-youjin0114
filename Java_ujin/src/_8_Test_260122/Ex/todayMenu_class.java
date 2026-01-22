package _8_Test_260122.Ex;
import javax.swing.*;
import java.awt.event.ActionListener;

public class todayMenu_class {
    public static void main(String[] args) {
        // 프레임 > 패널 > 버튼1,2 > 라벨 순서대로 만들기
        JFrame frame = new JFrame("오늘 저녁"); // 프레임(창) 생성
        JPanel panel = new JPanel(); // 패널 생성
        JButton button = new JButton("메뉴"); // 버튼1 생성 (메뉴)
        JButton exitBtn = new JButton("나가기"); // 버튼2 생성 (종료)
        JLabel label = new JLabel("미역국"); // 라벨 생성

        JLabel nameLabel = new JLabel("이름 입력: "); // 이름 입력 라벨
        JTextField nameField = new JTextField(10); // 텍스트 필드 입력창 생성

        // 조립하기
        frame.add(panel); // frame에 panel 추가

        panel.add(button); // panel에 button 추가
        panel.add(label);  // panel에 label을 추가
        panel.add(exitBtn); // panel에 버튼2 추가 (종료)

        panel.add(nameLabel); // panel에 라벨 붙이기
        panel.add(nameField); // panel에 텍스트필드 붙이기

        // 간단한 이벤트 처리 (맛보기)
        exitBtn.addActionListener(new ActionListener() {  // 익명 클래스 구현
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // 클릭시 동작할 기능 넣기 : 창.닫기();
                frame.dispose();
            }
        });

        // 창 크기, 기능 설정
        frame.setSize(300, 200); // 창 사이즈 (가로, 세로)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 나가기 버튼
        frame.setVisible(true); // 화면에 나타낼지 여부
    }
}