package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 음계를 저장할 배열
        int[] scale = new int[8];
        
        // 음계 입력 받기
        for (int i = 0; i < scale.length; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
        }
        
        // 시작값이 1인 경우
        if (scale[0] == 1) {
            for (int i = 1; i < scale.length; i++) {
                if (scale[i] != scale[i - 1] + 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        } else if (scale[0] == 8) {
            for (int i = 1; i < scale.length; i++) {
                if (scale[i] != scale[i - 1] - 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        } else if (scale[0] != 1 && scale[0] != 8) {
            System.out.println("mixed");
        }
    }
}
