package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        char[] chInput = input.toCharArray();
        for (int i = 0; i < chInput.length; i++) {
            boolean chIsUpperCase = Character.isUpperCase(chInput[i]);
            if (chIsUpperCase) {
                chInput[i] = Character.toLowerCase(chInput[i]);
            } else {
                chInput[i] = Character.toUpperCase(chInput[i]);
            }
        }
        for (char chRst : chInput) {
            System.out.print(chRst);
        }
    }
}
