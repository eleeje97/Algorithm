package Inflearn.section1;

/*
* 10. 가장 짧은 문자거리
 */

import java.util.*;

public class Sec1_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char c = scn.next().charAt(0);

        solution(str, c);
    }


    public static void solution(String str, char c) {
        ArrayList<Integer> charLocationList = new ArrayList();
        ArrayList<Integer> answer = new ArrayList<>();

        char[] strCharArray = str.toCharArray();
        for (int i = 0; i < strCharArray.length; i++) {
            if (strCharArray[i] == c) {
                charLocationList.add(i);
            }
        }


        for (int i = 0; i < str.length(); i++) {
            if (strCharArray[i] == c) {
                answer.add(0);
            } else {
                ArrayList<Integer> temp = new ArrayList();
                for (int j = 0; j < charLocationList.size(); j++) {
                    temp.add(Math.abs(i-charLocationList.get(j)));
                }
                answer.add(Collections.min(temp));
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
