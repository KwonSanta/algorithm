package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2738 {
    public static void main(String[] args) throws IOException {
        // 행렬 덧셈
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()); // n:3
        int m = Integer.parseInt(st.nextToken()); // m:3
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] rst = new int[n][m];

        // 입력 받은 문자열로 a,b(3x3행렬) 초기화
        for (int i = 0; i < n; i++) {
            String tmp = bf.readLine();
            st = new StringTokenizer(tmp, " "); // 각 루프 반복마다 새로 생성
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            String tmp = bf.readLine();
            st = new StringTokenizer(tmp, " "); // 각 루프 반복마다 새로 생성
            for (int j = 0; j < m; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 덧셈
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rst[i][j] = a[i][j] + b[i][j];
            }
        }

        // 결과 출력
        for (int[] row : rst) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        /*
        런타임 오류
        */
    }
}
