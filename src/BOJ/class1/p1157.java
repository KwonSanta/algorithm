package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class p1157 {
    public static void main(String[] args) throws IOException {

        int[] cnt = new int[26];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        char[] chInput = input.toUpperCase().toCharArray();

        // 알파벳 숫자 카운트 ++;
        for (char item : chInput) {
            cnt[item - 'A']++;
        }
        System.out.println(Arrays.toString(cnt));

        int maxCnt = 0;
        char maxChar = 'A';
        for (int i = 0; i < 26; i++) {
            if (maxCnt < cnt[i]) {
                maxCnt = cnt[i];
                maxChar = (char) ('A' + 1);
            } else if (cnt[i] == maxCnt) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}
