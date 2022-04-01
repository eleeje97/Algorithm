package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon1427 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nums_str = scn.next();
        int[] nums = new int[nums_str.length()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(nums_str.charAt(i)+"");
        }

        Arrays.sort(nums);
        
        String answer = "";
        for (int i : nums) {
            answer = i + answer;
        }

        System.out.println(answer);
    }
}
