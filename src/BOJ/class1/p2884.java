package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m < 45) {
            if (h > 0) {
                h--;
                m += 60;
                m -= 45;
                System.out.println(h + " " + m);
            } else {
                h += 24;
                h--;
                m += 60;
                m -= 45;
                System.out.println(h + " " + m);
            }
        } else if (m >= 45) {
            m -= 45;
            System.out.println(h + " " + m);
        }
    }
}
