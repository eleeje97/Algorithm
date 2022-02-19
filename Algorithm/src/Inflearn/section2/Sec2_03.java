package Inflearn.section2;

import java.util.Scanner;

public class Sec2_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = scn.nextInt();
        }

        for (int i = 0; i < num; i++) {
            b[i] = scn.nextInt();
        }

        for (String s : solution(num, a, b)) {
            System.out.println(s);
        }
    }
    
    public static String[] solution(int num, int[] a, int[] b) {
        String[] answer = new String[num];

        for (int i = 0; i < num; i++) {
            if (a[i] == b[i]) {
                answer[i] = "D";
            } else if (a[i] == 1) {
                if (b[i] == 2) {
                    answer[i] = "B";
                } else {
                    answer[i] = "A";
                }
            } else if (a[i] == 2) {
                if (b[i] == 1) {
                    answer[i] = "A";
                } else {
                    answer[i] = "B";
                }
            } else {
                if (b[i] == 1) {
                    answer[i] = "B";
                } else {
                    answer[i] = "A";
                }
            }
        }
        
        return answer;
    }
}
