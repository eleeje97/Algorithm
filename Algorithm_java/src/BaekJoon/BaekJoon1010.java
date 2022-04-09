package BaekJoon;

import java.util.Scanner;

public class BaekJoon1010 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scn.nextInt();
            int M = scn.nextInt();

            int answer = 1;
            for (int j = 0; j < N; j++) {
                answer *= M-j;
                answer /= j+1;
            }
            System.out.println(answer);
        }
    }
}
