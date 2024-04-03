package BOJ.class1;

import java.util.Scanner;

public class p2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = n-2-i; k >= 0; k--) {
                System.out.print(" "); // 4-i
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*"); // i+1
            }
            System.out.println();
        }
    }
}
