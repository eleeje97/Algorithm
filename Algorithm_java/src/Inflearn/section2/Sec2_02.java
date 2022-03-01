package Inflearn.section2;

import java.util.Scanner;

public class Sec2_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] heights = new int[num];
        for (int i = 0; i < num; i++) {
            heights[i] = scn.nextInt();
        }

        System.out.println(solution(heights));
    }

    public static int solution(int[] heights) {
        int answer = 0;
        int current = 0;

        for (int height : heights) {
            if (height > current) {
                answer++;
                current = height;
            }
        }

        return answer;
    }
}
