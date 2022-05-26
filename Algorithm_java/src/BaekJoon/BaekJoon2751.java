package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2751 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        Arrays.sort(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
