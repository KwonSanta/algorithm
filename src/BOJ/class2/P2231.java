package BOJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        // 방법 1.
        // (int)input + input[0] + ... + input[input.length]
        int sum = 0;
        int rst = 0;

        for (int i = 0; i < input.length(); i++) {
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        rst = sum + Integer.parseInt(input);
        System.out.println(rst);

        // 방법 2.
        // int num + for loop{ 각 자리수 100, 10, .. 나누고 나눈값 더하기 }

    }
}


