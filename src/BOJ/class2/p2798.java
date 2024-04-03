package BOJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {
    public static void main(String[] args) throws IOException {

        // n : 카드 개수
        // m : m 을 넘지않는 숫자 조합 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(numbers, n, m);
        System.out.println(result);
    }

    static int search(int[] numbers, int n, int m) {
        int result = 0;
        
        // 3개를 고르기 떄문에 첫번째 카드는 N-2 까지만 순회
        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    int temp = numbers[i] + numbers[j] + numbers[k];
                    if (m == temp) {
                        return temp;
                    }
                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
