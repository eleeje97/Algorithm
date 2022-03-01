/**
 * 위장
 **/
package Programmers.hash;

import java.util.*;

/*
Disguise solution = new Disguise();
		
String[][] clothes = {{"yellow_hat", "headgear"},
						{"blue_sunglasses", "eyewear"},
						{"green_turban", "headgear"}};
		
System.out.println(solution.solution(clothes));
*/

public class Disguise {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        
        for (int i = 0; i < clothes.length; i++) {
			hashmap.put(clothes[i][1], hashmap.getOrDefault(clothes[i][1], 0) + 1);
		}
        
        answer = 1;
        
        for (Integer value : hashmap.values()) {
			answer *= value + 1;
		}
        
        answer--;
        
        return answer;
    }
}