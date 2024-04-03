package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        if (input.isEmpty()) {
            System.out.println(0);
        }
        else {
            input = input.trim();
            String[] words = input.split(" ");
            System.out.println(words.length);
        }

    }
}
