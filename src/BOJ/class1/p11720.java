package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720 {
    public static void main(String[] args) throws IOException {

        int sum = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bf.readLine());
        String input = bf.readLine();
        char[] numbers = input.toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(String.valueOf(numbers[i]));
        }
        System.out.println(sum);
    }
}
