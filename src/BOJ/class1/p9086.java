package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9086 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());


        for (int i = 0; i < n; i++) {
            String input = bf.readLine();
            char[] inputArr = input.toCharArray();
            String rst = "" + inputArr[0] + inputArr[inputArr.length - 1];
            System.out.println(rst);
        }
    }
}
