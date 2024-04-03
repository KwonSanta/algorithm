package BOJ.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p4153 {
    public static void main(String[] args) throws IOException {

        boolean run = true;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // #0. input 받기
        while (run) { // 직각삼각형 여부 확인 -> isRight ? right : wrong
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0 && num3 == 0) { // 마지막 줄이 0 0 0 이 입력되면 테스트 종료.
                break;
            } else { // input 제대로 주어졌을 떄 실행문

                // #1. max값 찾기
                int[] numbers = {num1, num2, num3};
                Arrays.sort(numbers);

                int a = numbers[0];
                int b = numbers[1];
                int c = numbers[2];

                // #2. (a * a) + (b * b) = c * c 조건을 만족하는 지 확인
                boolean isRight = (a * a) + (b * b) == c * c;

                if (isRight) { // #3. 직각삼각형 O : "right" 출력
                    System.out.println("right");
                } else { // #4. 직각삼각형 X : "wrong" 출력
                    System.out.println("wrong");
                }
            }
        }
    }
}
