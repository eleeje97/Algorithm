/**
 * K번째 수
 */

package Programmers.sort;

import java.util.Arrays;

/*
KthNumber solution = new KthNumber();
int[] array = {1, 5, 2, 6, 3, 7, 4};
int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
int[] answer = solution.solution(array, commands);

for (int i = 0; i < answer.length; i++) {
	System.out.print(answer[i] + " ");
}
*/

public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	int[] temp = new int[commands[i][1] - commands[i][0] + 1];
			for (int j = 0; j <= commands[i][1] - commands[i][0]; j++) {
				temp[j] = array[j + commands[i][0] - 1];
			}
			
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
        
        
        return answer;
    }
}
