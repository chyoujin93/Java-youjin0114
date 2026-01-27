package _11_test_260127.memberProject.memberProject.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class _3_update_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 수정 예제 확인. ");
        //드라이버 로딩.

        // 반복1
        // 순서1, 드라이버 로드, 자바 -> 오라클로 쿼리 를 전달하기 위한 도구 모음집을 메모리에 로드
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 수정해보기.
        // 이상용jdbc,jdbc@naver.com,1234,20 , 변경전
        // 이상용jdbc2,jdbc@naver.com,1234,20 , 변경후
        updateMember("이상용jdbc2","jdbc@naver.com","1234",20);

    }

    // 수정하는 메서드 추가.
//    public static void updateMember(MemberDTO member) {
    public static void updateMember(String name, String email, String password, int age) {
        // 이메일(PK 역할)을 기준으로 이름, 비밀번호, 나이를 수정한다고 가정
        // 반복2
        String sql = "UPDATE members SET name = ?, password = ?, age = ? WHERE email = ?";

        // 반복3
        try (//1, 고정2
             Connection conn = getConnection(
                     "jdbc:oracle:thin:@localhost:1521:xe",
                     "scott",
                     "tiger");// 회원 추가 기능에서, 같은 코드 재사용.
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 반복4, 여기는 변경됨
            // SQL문의 ? 순서에 맞춰 값 설정
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            pstmt.setInt(3, age);
            pstmt.setString(4, email); // WHERE절의 이메일

            // 반복5,여기는 변경됨
            int result = pstmt.executeUpdate(); // 변경된 행의 개수 반환

            // 반복6,여기는 변경됨
            if (result > 0) {
                System.out.println("회원 정보 수정 완료!");
            } else {
                System.out.println("수정할 회원을 찾지 못했습니다. (이메일 확인 필요)");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
