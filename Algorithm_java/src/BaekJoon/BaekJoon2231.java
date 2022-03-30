package BaekJoon;

import java.util.Scanner;

public class BaekJoon2231 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        int answer = 0;
        for (int i = 1; i < N; i++) {
            int temp = i;
            String str_num = i + "";
            for (char c : str_num.toCharArray()) {
                temp += Integer.parseInt(c+"");
            }
            if (temp == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
