package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p8958 {
    public static void main(String[] args) throws IOException {

        // O -> X 일 때, 연속된 O의 개수 자리수마다 +1점
        // ex) "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int caseNum = Integer.parseInt(bf.readLine());
        String[] arr = new String[caseNum];
        for (int i = 0; i < caseNum; i++) {
            arr[i] = bf.readLine();
        }

        for (int i = 0; i < caseNum; i++) {
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
