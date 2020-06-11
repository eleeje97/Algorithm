/**
 * 이중 우선순위 큐
 */

package Programmers.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
DualPriorityQueue solution = new DualPriorityQueue();

String[] operations = {"I 16", "D 1"};
//String[] operations = { "I 7", "I 5", "I -5", "D -1" };

int[] answer = solution.solution(operations);
for (int i = 0; i < answer.length; i++) {
	System.out.print(answer[i] + " ");
}
*/


public class DualPriorityQueue {
	public int[] solution(String[] operations) {
		int[] answer = {0, 0};
		PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

		String[] temp;
		char order;
		int num;

		for (int i = 0; i < operations.length; i++) {
			temp = operations[i].split(" ");
			order = temp[0].charAt(0);
			num = Integer.parseInt(temp[1]);

			if (order == 'I') {
				minQueue.add(num);
				maxQueue.add(num);
			} else {
				if (num == 1) {
					// �ִ밪 ����
					minQueue.remove(maxQueue.peek());
					maxQueue.poll();
				} else {
					// �ּڰ� ����
					maxQueue.remove(minQueue.peek());
					minQueue.poll();
				}
			}
		}
		
		if(!minQueue.isEmpty() && !maxQueue.isEmpty()) {
			answer[0] = maxQueue.poll();
			answer[1] = minQueue.poll();
		}

		return answer;
	}
}