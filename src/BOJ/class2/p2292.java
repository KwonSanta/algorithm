package BOJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1; // 겹 수
        int range = 2; // 범위 (최솟값 기준)

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) { // 범위가 n보다 커지기 직전까지 반복
                range = range + (count * 6);
                count++;
            }
            System.out.println(count);
        }
    }
}
