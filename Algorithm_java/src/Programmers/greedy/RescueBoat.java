/**
 * 구명보트
 */

package Programmers.greedy;

import java.util.*;

/*
RescueBoat solution = new RescueBoat();

//int[] people = {70, 80, 50};
//int[] people = {70, 50, 80, 50};
int[] people = {10, 30, 40, 80, 80};

int limit = 100;		

System.out.println(solution.solution(people, limit));
*/

public class RescueBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length -1;
        
        while(i<=j) {
        	if(i==j) {
        		answer++;
        		break;
        	} else if(people[i] + people[j] <= limit) {
        		answer++;
        		i++;
        		j--;
        	} else {
        		answer++;
        		j--;
        	}
        }
        
        return answer;
    }
}