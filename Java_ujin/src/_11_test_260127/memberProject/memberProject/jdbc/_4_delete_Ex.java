package _11_test_260127.memberProject.memberProject.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class _4_delete_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 삭제 예제 확인. ");
        //드라이버 로딩.

        // 반복1
        // 순서1, 드라이버 로드, 자바 -> 오라클로 쿼리 를 전달하기 위한 도구 모음집을 메모리에 로드
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 수정해보기.
        // 이상용jdbc,jdbc@naver.com,1234,20 , 변경전
        // 이상용jdbc2,jdbc@naver.com,1234,20 , 변경후
        deleteMember("jdbc@naver.com");

    }

    // 기능 추가.
    public static void deleteMember(String email) {
        // 반복2
        String sql = " DELETE FROM members WHERE email = ?";

        try (//1, 고정2
             Connection conn = getConnection(
                     "jdbc:oracle:thin:@localhost:1521:xe",
                     "scott",
                     "tiger");// 회원 추가 기능에서, 같은 코드 재사용.
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 반복4, 여기는 변경됨
            pstmt.setString(1, email);

            // 반복5,여기는 변경됨
            int result = pstmt.executeUpdate();
            //반복6,여기는 변경됨
            if (result > 0) {
                System.out.println("회원 삭제 완료: " + email);
            } else {
                System.out.println("삭제할 회원이 존재하지 않습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
