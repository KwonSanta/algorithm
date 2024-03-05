package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p8958 {
    public static void main(String[] args) throws IOException {

        // O -> X 일 때, 연속된 O의 개수 자리수마다 +1점
        // ex) "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(bf.readLine());
        String[] test = new String[caseNum];
        for (int i = 0; i < caseNum; i++) {
            test[i] = bf.readLine();
        }

        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < test.length; i++) { // 테스트 케이스 횟수만큼 반복
            sum = 0;
            String score = test[i];
            for (int j = 0; j < score.length(); j++) {
                if (score.charAt(j) == 'O') { // j번째자리 'O'출현
                    cnt=1;
                    sum=1;
                    if (score.charAt(j+1) == 'O') { // k = j+1자리부터 'O' -> cnt++ 후 sum에 추가
                        cnt++;
                        sum += cnt;
                    } else {    // j+1자리부터 != 'O' -> cnt=1(초기화), 다음 k 인덱스 진행
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
