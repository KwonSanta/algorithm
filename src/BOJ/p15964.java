package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int resutl = Math_task.fn(num1, num2);

    }
}

class Math_task {
    int a, b;
    Math_task() {}
    Math_task(int a, int b) {
        this.a = a;
        this.b = b;
    }
    static int fn(int num1, int num2) {
        int result = (num1 + num2) * (num1 - num2);
        System.out.println(result);
        return result;
    }
}
