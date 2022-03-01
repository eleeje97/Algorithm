/**
 * 프린터
 */
package Programmers.stack_queue;

import java.util.*;

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Task> queue = new LinkedList<Task>();
        int[] print_order = new int[priorities.length];
        
        for (int i = 0; i < priorities.length; i++) {
			queue.add(new Task(i, priorities[i]));
		}


        int flag = 0;
        int order = 0;
        while(!queue.isEmpty()) {
        	flag = 0;
        	for (Task task : queue) {
				if(queue.peek().priority < task.priority) {
					queue.add(queue.poll());
					flag = 1;
					break;
				}
        	}
        	
        	if(flag == 0) {
        		Task task = queue.poll();
        		print_order[task.location] = order + 1;
        		order++;
        	}
        }

        
        answer = print_order[location];
        return answer;
    }
	
	class Task {
		int location;
		int priority;
		
		Task(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}
		
	}
}
