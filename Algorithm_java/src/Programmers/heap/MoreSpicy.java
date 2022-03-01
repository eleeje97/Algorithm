/**
 * 더 맵게
 */

package Programmers.heap;

import java.util.*;

/*
MoreSpicy solution = new MoreSpicy();

int[] scoville = {1, 2, 3, 9, 10, 12};
int K = 7;

System.out.println(solution.solution(scoville, K));
*/

public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < scoville.length; i++) {
            pQueue.add(scoville[i]);
        }

        while(pQueue.peek() < K) {
            if(pQueue.size()==1) {
                answer = -1;
                break;
            }

            int first = pQueue.poll();
            int second = pQueue.poll();

            int mixed = first + second*2;
            pQueue.add(mixed);
            answer++;
        }

        return answer;
    }
}