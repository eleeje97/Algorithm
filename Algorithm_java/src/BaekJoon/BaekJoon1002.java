package BaekJoon;

import java.util.Scanner;

public class BaekJoon1002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = scn.nextInt();
            int y1 = scn.nextInt();
            int r1 = scn.nextInt();
            int x2 = scn.nextInt();
            int y2 = scn.nextInt();
            int r2 = scn.nextInt();
            int max = Math.max(r1, r2);
            int min = Math.min(r1, r2);
            int answer = 0;


            // 조규현과 백승환사이의 거리
            double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

            if (r == 0 && r1 == r2) {
                answer = -1;
            } else if (r > max + min) {
                answer = 0;
            } else if (r == max + min) {
                answer = 1;
            } else {
                if (max == min + r) {
                    answer = 1;
                } else if (max > min + r) {
                    answer = 0;
                } else {
                    answer = 2;
                }
            }

            System.out.println(answer);
        }
    }
}
