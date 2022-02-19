package Inflearn.section2;

import java.util.Scanner;

public class Sec2_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i : solution(n)) {
            System.out.print(i +" ");
        }
    }

    public static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }
}
