package _9_test_260123;

//8교시_마무리_복습

import _6_Test_260120.cl._3_MemberBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lastclass_single_pr extends JFrame {
    // 해당 클래스가 JFrame 관련 그리기 도구를 사용하기위해 상속 처리
    public static void main(String[] args) {

        private static final String FILE_NAME = "members.txt";
        // 회원가입프로그램 저장파일 연결시키는 작업

        private Map<String, _3_MemberBase> members = new HashMap<>();
        // 전역으로 사용할 멤버들 지정, 변수 지정

        private _3_MemberBase loggedInMember = null;
        // 로그인한 멤버 상태

        // ▼ GUI 화면 구성 요소, 전역
        private JTextArea displayArea; // 결과 출력 위한 텍스트 영역


    }
}
