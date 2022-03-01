package Inflearn.section2;

import java.util.Scanner;

public class Sec2_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[][] array = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        System.out.println(solution(num, array));
    }

    public static int solution(int num, int[][] array) {
        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int top, bottom, left, right;

                if (i-1 < 0) top = 0;
                else top = array[i-1][j];
                if (i+1 >= num) bottom = 0;
                else bottom = array[i+1][j];
                if (j-1 < 0) left = 0;
                else left = array[i][j-1];
                if (j+1 >= num) right = 0;
                else right = array[i][j+1];

                int current = array[i][j];
                if (current > top && current > bottom && current > left && current > right) {
                    count++;
                }
            }
        }

        return count;
    }
}
