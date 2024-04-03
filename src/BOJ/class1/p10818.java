package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int intCase = Integer.parseInt(bf.readLine());
        int[] numbers = new int[intCase];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[intCase-1]);
    }
}
