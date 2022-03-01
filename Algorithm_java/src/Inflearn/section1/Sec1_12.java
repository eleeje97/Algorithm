package Inflearn.section1;

import java.util.Scanner;

public class Sec1_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String str = scn.next();

        System.out.println(solution(num, str));
    }

    public static String solution(int num, String str) {
        String answer = "";
        String current;
        int code = 0;

        str = str.replace("#", "1");
        str = str.replace("*", "0");


        for (int i = 0; i < num; i++) {
            current = str.substring(0, 7);
            str = str.substring(7);

            for (int j = 6; j >= 0; j--) {
                int n = Integer.parseInt(current.charAt(j) + "");
                code += n * Math.pow(2, 7-(j+1));
            }

            answer += Character.toString((char)code);
            code = 0;
        }

        return answer;
    }
}
