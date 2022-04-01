package BaekJoon;

import java.util.*;

public class BaekJoon2108 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        Arrays.sort(nums);

        int sum = 0;
        HashMap<Integer, Integer> mode = new HashMap<>();
        for (int i : nums) {
            sum += i;
            mode.put(i, mode.getOrDefault(i, 0) + 1);
        }

        System.out.println(Math.round((float)sum/(float)n)); // 산술평균
        System.out.println(nums[n/2]); // 중앙값
        // 최빈값
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : mode.values()) {
            temp.add(i);
        }

        Collections.sort(temp);
        int max = temp.get(temp.size() - 1);

        temp.clear();
        for (int key : mode.keySet()) {
            if (mode.get(key) == max) {
                temp.add(key);
            }
        }

        if (temp.size() == 1) {
            System.out.println(temp.get(0));
        } else {
            Collections.sort(temp);
            System.out.println(temp.get(1));
        }

        System.out.println(nums[n-1] - nums[0]); // 범위
    }
}
