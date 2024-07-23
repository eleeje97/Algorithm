package Programmers.hash;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Phonketmon {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{3, 1, 2, 3})); // 2
        System.out.println(solution.solution(new int[]{3, 3, 3, 2, 2, 4})); // 3
        System.out.println(solution.solution(new int[]{3, 3, 3, 2, 2, 2})); // 2
    }

    static class Solution {
        public int solution(int[] nums) {
            Set<Integer> numberSet = Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toSet());
            return Math.min(numberSet.size(), nums.length / 2);
        }
    }
}

