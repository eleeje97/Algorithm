package Inflearn.section2;

import java.util.Scanner;

public class Sec2_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int studentNum = scn.nextInt();
        int testNum = scn.nextInt();

        int[][] grade = new int[testNum][studentNum];
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                grade[i][scn.nextInt()-1] = j+1;
            }
        }

        System.out.println(solution(testNum, studentNum, grade));
    }

    public static int solution(int testNum, int studentNum, int[][] grade) {
        int answer = 0;

        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                int count = 0;
                for (int k = 0; k < testNum; k++) {
                    if (grade[k][i] < grade[k][j]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == testNum) answer++;
            }
        }

        return answer;
    }
}
