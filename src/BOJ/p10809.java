package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine(); // backjoon
//        char[] ch = input.toCharArray(); // {'b','a','c','k','j','o','o','n'}
        char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] cnt = new int[26];

        // 단어가 포함되어있을 경우 복수라도 처음 등장하는 위치를....
        for (int i = 0; i< alp.length; i++) {
            System.out.print((input.indexOf(alp[i])) + " ");
        }
    }
}
