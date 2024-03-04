package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class p2577 {
    public static void main(String[] args) throws IOException {
        
        // #1. 입력값을 a, b, c에 할당
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        // #2. number = a * b * c
        int number = a * b * c;

        // #3. 각 자리수를 문자배열로 변경
        String str = Integer.toString(number);
        char[] chArr = str.toCharArray();

        // 각자리수 카운트 배열 생성
        int[] cnt = new int[10];

        // #4'0'을 뺴주면서 char 값 ++;
        for (char item : chArr) {
            int intCnt = item - '0';
            cnt[intCnt]++;
        }
        for (int item : cnt) {
            System.out.println(item);
        }
    }
}