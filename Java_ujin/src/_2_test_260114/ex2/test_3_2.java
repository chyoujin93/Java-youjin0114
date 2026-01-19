package _2_test_260114.ex2;
import java.util.Scanner;
import java.util.Arrays;
public class test_3_2 {
    public static void main(String[] args) {
        //2. 3*3배열(테이블,행렬,이중배열) 만들어 모든 요소에 1~9까지 채우고 출력
        //순서1. 배열생성[행][열]
        int[][] grid = new int[3][3];
        //순서2. 생성된 배열, 이중 for문 이용, 값을 대입
        //시작값을 설정(초기값)
        int num = 1;
        //행을 결정하는 for 문, 바깥쪽 for
        for (int i = 0; i < 3; i++) {
            //열을 결정하는 for 문, 안쪽 for
            for (int j = 0; j < 3; j++) {
                grid[i][j] = num++;
                //i=0일때, j=0~2, [0][0] [0][1] [0][2]
                //i=1일때, j=0~2, [1][0] [1][1] [1][2]
                //i=2일때, j=0~2, [2][0] [2][1] [2][2]
            }
        }
        //순서3. 생성된 배열, 이중 for문 이용, 값을 출력
//        System.out.println(grid[0][0]]);
//        System.out.println(grid[0][1]]);
//        System.out.println(grid[0][2]]);
//        System.out.println(grid[1][0]]);
//        System.out.println(grid[1][1]]);
//        System.out.println(grid[1][2]]);
//        System.out.println(grid[2][0]]);
//        System.out.println(grid[2][1]]);
//        System.out.println(grid[2][2]]);
        for (int[] row : grid) {
            //grid라는 행열에서 각 0행부터, 2행까지, 3개의 행을 꺼내기.
            for (int val : row) {
                System.out.println("배열의 요소 꺼내기 : " + val);
            }
        }
    }
}
