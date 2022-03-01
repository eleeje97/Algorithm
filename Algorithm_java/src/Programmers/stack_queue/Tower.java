/**
 * 탑
 */
package Programmers.stack_queue;

import java.util.Stack;

/*
Tower solution = new Tower();
//int[] heights = {6,9,5,7,4};	//[0,0,2,2,4]
//int[] heights = {3,9,9,3,5,7,2};	//[0,0,0,3,3,3,6]
int[] heights = {1,5,3,6,7,6,5};	//[0,0,2,0,0,5,6]
int[] answer = solution.solution(heights);
for (int i : answer) {
	System.out.print(i + " ");
}
*/

public class Tower {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        answer[0] = 0;
        
        Stack<Integer> heights_stack = new Stack<Integer>();
        for (int i = 0; i < heights.length; i++) {
			heights_stack.push(heights[i]);
			for (int j = heights_stack.size() - 2; j >= 0; j--) {
				if(heights_stack.get(j) > heights[i]) {
					answer[i] = j + 1;
					break;
				}
				answer[i] = 0;
			}
		}
        
        return answer;
    }
}
