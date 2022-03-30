package BaekJoon;

import java.util.Scanner;

public class BaekJoon7568 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] body = new int[N][2];

        for (int i = 0; i < N; i++) {
            body[i][0] = scn.nextInt();
            body[i][1] = scn.nextInt();
        }

        String answer = "";
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (body[j][0] > body[i][0] && body[j][1] > body[i][1]) {
                        count++;
                    }
                }
            }

            answer += count+1 + " ";
        }

        System.out.println(answer);
    }
}
