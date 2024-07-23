package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class IncompletePlayer {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})); // "leo"
        System.out.println(solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"})); // "vinko"
        System.out.println(solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"})); // "mislav"
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String, Integer> runner = new HashMap<>();
            for (String p : participant) {
                runner.put(p, runner.getOrDefault(p, 0) + 1);
            }

            for (String c : completion) {
                runner.put(c, runner.get(c) - 1);
            }

            return runner.keySet().stream()
                    .filter(key -> runner.get(key) > 0)
                    .findAny()
                    .orElse("");
        }
    }
}
