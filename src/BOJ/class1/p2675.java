package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int caseNum = Integer.parseInt(bf.readLine());
        for (int i = 0; i < caseNum; i++) {  // 2번 반복
            st = new StringTokenizer(bf.readLine(), " ");
            int cnt = Integer.parseInt(st.nextToken()); // 3
            String input = st.nextToken();              // ABC
            String rst = "";
            for (int j = 0; j < input.length(); j++) {  // 3번 반복, 5번 반복
                for (int k = 0; k < cnt; k++) { // string의 길이만큼 반복 : 3, 4
                    rst += input.charAt(j);
                }
            }
            System.out.println(rst);
        }
    }
}
