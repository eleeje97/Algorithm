/**
 * 기능개발
 * 
 * 큐에 (작업진도, 작업속도)를 저장
 * 큐의 첫 번째 원소의 작업진도가 100이상일 때까지 모든 작업진도에 작업속도만큼 계속 더하기
 * 큐의 첫 번째 원소의 작업진도가 100이상이 되면, release_num을 1 늘리고, 첫 번째 원소 삭제 (첫 번째 원소의 작업진도가 100 미만일 때까지 반복)
 * 큐에 원소가 없을 때까지 위 작업 반복
 */

package Programmers.stack_queue;

import java.util.*;

/*
FunctionDevelopment solution = new FunctionDevelopment();
int[] progresses = {93,30,55};
int[] speeds = {1,30,5};	
// return: [2,1]

int[] answer = solution.solution(progresses, speeds);
for (int i : answer) {
	System.out.print(i + " ");
}
*/

public class FunctionDevelopment {
	public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
        Queue<Task> tasks = new LinkedList<Task>();
        
        // 큐에 작업(작업진도, 작업속도) 저장
        for (int i = 0; i < progresses.length; i++) {
			tasks.add(new Task(progresses[i], speeds[i]));
		}
        
        

        int release_num; // 한번에 배포하는 개수
        while(!tasks.isEmpty()) {
        	while(tasks.peek().progress < 100) { // 첫 번째 원소의 작업진도가 100 미만이라면 
        		for (Task task : tasks) { // 모든 작업 진행
        			if(task.progress < 100)
        				task.progress += task.speed;
				}
        	}
        	
        	
        	// 작업이 완료된 개수만큼 배포
        	release_num = 0;
        	while(!tasks.isEmpty() && tasks.peek().progress >= 100) {
    			release_num++;
            	tasks.poll();
        	}
        	answer_list.add(release_num);
        }
        
        
        // 리스트를 배열로 변환
        int[] answer = new int[answer_list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = answer_list.get(i);
		}
        
        return answer;
    }
	
	
	// 작업진도, 작업속도를 속성으로 갖는 작업 클래스
	class Task {
		int progress;
		int speed;
		
		Task(int progress, int speed) {
			this.progress = progress;
			this.speed = speed;
		}
	}
}
