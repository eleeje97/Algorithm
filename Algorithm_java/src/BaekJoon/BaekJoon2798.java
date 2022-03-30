package BaekJoon;

import java.util.*;

public class BaekJoon2798 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scn.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < N-2; i++) {
            if (nums[i] >= M) {
                continue;
            }
            for (int j = i+1; j < N-1; j++) {
                if (nums[i] + nums[j] >= M) {
                    continue;
                }
                for (int k = j+1; k < N; k++) {
                    if (nums[i] + nums[j] + nums[k] <= M) {
                        answer = Math.max(answer, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
