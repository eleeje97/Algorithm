/**
 * 완주하지 못한 선수
 */

package Programmers.hash;

import java.util.HashMap;

/*
IncompletePlayer solution = new IncompletePlayer();

String[] participant = { "mislav", "stanko", "mislav", "ana" };
String[] completion = { "stanko", "ana", "mislav" };

System.out.println(solution.solution(participant, completion));
*/

public class IncompletePlayer {

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		for (int i = 0; i < participant.length; i++) {
			hashmap.put(participant[i], hashmap.getOrDefault(participant[i], 0) + 1);
		}

		for (int i = 0; i < completion.length; i++) {
			hashmap.put(completion[i], hashmap.get(completion[i]) - 1);
		}

		for (String key : hashmap.keySet()) {
			if (hashmap.get(key) == 1)
				answer = key;
		}

		return answer;
	}

}
