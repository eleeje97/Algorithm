package Inflearn.section2;

import java.util.Scanner;

public class Sec2_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[][] students = new int[num][5];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                students[i][j] = scn.nextInt();
            }
        }

        System.out.println(solution(num, students));
    }

    public static int solution(int num, int[][] students) {
        int answer = 0;
        boolean[][] check = new boolean[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < num; k++) {
                    if (students[i][j] == students[k][j]) {
                        check[i][k] = true;
                    }
                }
            }
        }

        int[] count = new int[num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (check[i][j]) count[i]++;
            }
        }

        for (int i = 0; i < num; i++) {
            if (count[answer] < count[i]) {
                answer = i;
            }
        }

        return answer+1;
    }
}
