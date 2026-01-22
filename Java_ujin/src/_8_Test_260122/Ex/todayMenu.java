package _8_Test_260122.Ex;
import javax.swing.*;

public class todayMenu {
    public static void main(String[] args) {
        // 실습1
        // 1) 창을 띄우고, 버튼과 라벨을 동시에 추가하세요
        // 내용은 오늘 먹을 점심 관련 아무 글
//         힌트: 버튼,라벨을 패널에 추가하기
//        panel.add(button);
//        JPanel panel = new JPanel(); 추가
//        panel  을 프레임(창) 에 추가
//        frame.add(panel);

        JFrame frame = new JFrame("오늘 점심"); // 창 생성
        JPanel panel = new JPanel();               // 패널 생성
        JButton button = new JButton("메뉴");  // 버튼 생성
        JLabel label = new JLabel("잔치국수");   // 라벨 생성


        frame.add(panel); // frame에 panel 추가

        panel.add(button); // frame에 추가하는게 아닌,
        panel.add(label);  // panel에 button과 label을 추가


        frame.setSize(300, 200); // 창 사이즈 (가로, 세로)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 나가기 버튼
        frame.setVisible(true); // 화면에 나타낼지 여부

    }
}