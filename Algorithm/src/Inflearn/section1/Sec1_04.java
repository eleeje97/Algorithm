package Inflearn.section1;

/*
* 4. 단어 뒤집기
 */

import java.util.Scanner;

public class Sec1_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        String[] strings= new String[count];
        for (int i = 0; i < count; i++) {
            strings[i] = scn.next();
        }

        solution(strings);

    }

    public static void solution(String[] strings) {
        String tmp = "";
        for (String s : strings) {
            for (int i = s.length() - 1; i >= 0; i--) {
                tmp += s.charAt(i);
            }
            System.out.println(tmp);
            tmp = "";
        }
    }
}
