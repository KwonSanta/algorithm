package BOJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주어진 수 N개 중에서 소수 몇개인지 세기
public class p1978 {
    public static void main(String[] args) throws IOException {

        /* input 받기 */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 1 줄 : 수의 개수 N
        int n = Integer.parseInt(bf.readLine());
        // 2 줄 : N개의 수
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());;
        for (int i = 0; i < 4; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int num : numbers) {
            // 소수 판별
            if (isPrime(num)) cnt++;
        }

        System.out.println(cnt); // result
    }

    // for loop : 소수찾기
    // (주의) 1 != 소수
    private static boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num == 1) { // 소수의 조건 : 1과 자기 자신만을 약수로 가지는 수
                return false;
            } else if (num % i == 0) { // 2~ (num/2) 수 중에 나누어 떨어지는 수가 있으면 false
                return false;
            }
        }
        return true;
    }
}
