package BOJ.class1;

import java.util.Arrays;
import java.util.Scanner;

public class p2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] input = new int[9];
        int max = 0, cnt = 0;
        for (int i = 0; i < 9; i++) {
            input[i] = sc.nextInt();
            if (input[i] > max) {
                max = input[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
