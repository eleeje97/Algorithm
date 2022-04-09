package BaekJoon;

import java.util.Scanner;

public class BaekJoon1004 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T =  scn.nextInt();
        for (int i = 0; i < T; i++) {
            int start_x = scn.nextInt();
            int start_y = scn.nextInt();
            int end_x = scn.nextInt();
            int end_y = scn.nextInt();

            int n = scn.nextInt();
            int start_circle = 0;
            int end_circle = 0;
            for (int j = 0; j < n; j++) {
                int x = scn.nextInt();
                int y = scn.nextInt();
                int r = scn.nextInt();

                double start_dist = Math.sqrt(Math.pow(start_x-x, 2) + Math.pow(start_y-y, 2));
                double end_dist = Math.sqrt(Math.pow(end_x-x, 2) + Math.pow(end_y-y, 2));
                if (start_dist < r && end_dist > r) {
                    start_circle++;
                } else if (start_dist > r && end_dist < r) {
                    end_circle++;
                }

            }

            System.out.println(start_circle+end_circle);
        }
    }
}
