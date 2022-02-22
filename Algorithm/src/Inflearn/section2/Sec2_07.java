package Inflearn.section2;

import java.util.Scanner;

public class Sec2_07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] check = new int[num];

        for (int i = 0; i < num; i++) {
            check[i] = scn.nextInt();
        }
        System.out.println(solution(check));
    }

    public static int solution(int[] check) {
        int totalScore = 0;
        int currentScore = 0;

        for (int isRight : check) {
            if (isRight == 1) {
                currentScore++;
                totalScore += currentScore;
            } else {
                currentScore = 0;
            }
        }

        return totalScore;
    }
}
