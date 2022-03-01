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

        for (int i = 0; i < 5; i++) {

        }

        return answer;
    }
}
