package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3052 {
    public static void main(String[] args) throws IOException {

        int divNum = 42;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(bf.readLine()) % 42;
        }

        // 서로 다른 나머지는 몇개인지 구하기
        // 나머지는 0~41까지의 숫자들
        boolean[] cnt = new boolean[42];
        for (boolean item : cnt) {
            for (int number : numbers) {
                cnt[number] = true;
            }
        }
        int n = 0;
        for (boolean item : cnt) {
            if (item == true) {
                n++;
            }
        }
        System.out.println(n);
    }
}
