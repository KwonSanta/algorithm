package BOJ.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2754 {
    public static void main(String[] args) throws IOException {
        String[] gradeTable = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] scoreTable = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String grade = bf.readLine();

        for (int i = 0; i < gradeTable.length; i++) {
            if (gradeTable[i].equals(grade)) {
                System.out.println(scoreTable[i]);
            }
        }

    }
}
