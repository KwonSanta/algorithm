package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class p10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test_case = Integer.parseInt(bf.readLine());
        for (int i = 0; i < test_case; i++) { // 테스트 케이스 순환
            st = new StringTokenizer(bf.readLine());
            int h = Integer.parseInt(st.nextToken()); // 6   30
            int w = Integer.parseInt(st.nextToken()); // 12  50
            int n = Integer.parseInt(st.nextToken()); // 10  72
            boolean[][] hotel = new boolean[h][w];

            int cnt = 0;
            for (int k = 0; k < w; k++) {
                for (int j = 0; j < h; j++) {
                    if (!hotel[j][k]) { // (j,0)방에 true라면
                        hotel[j][k] = true; // (j+1, 0) 방으로 사람을 넣고 true로 바꿈
                        cnt++;
                        if (cnt == n) {
                            System.out.println((j + 1) + "0" + (k + 1)); // j0k호
                        }
                    }
                }
            }
        }
    }
}
