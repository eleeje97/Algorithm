/**
 * 가장 큰 수
 */

package Programmers.sort;

import java.util.Arrays;
import java.util.Comparator;


/*
//int[] numbers = {6, 10, 2};
int[] numbers = {3, 30, 34, 5, 9};
//int[] numbers = {0, 0, 0, 0};
//int[] numbers = {20, 200, 20};

TheBiggestNumber solution = new TheBiggestNumber();
System.out.println(solution.solution(numbers));
*/

public class TheBiggestNumber {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] list = new String[numbers.length];
        for (int i = 0; i < list.length; i++) {
         list[i] = String.valueOf(numbers[i]);
      }

        
        Arrays.sort(list, new Comparator<String>() {

         @Override
         public int compare(String s1, String s2) {
            if((s1+s2).compareTo(s2+s1) > 0) {
               return -1;
            } else if((s1+s2).compareTo(s2+s1) < 0) {
               return 1;
            } else {
               return 0;
            }
            
         }
      });

        if(list[0].equals("0"))
           return "0";
        
        for (int i = 0; i < list.length; i++) {
         answer += list[i];
      }
        
        return answer;
    }

}