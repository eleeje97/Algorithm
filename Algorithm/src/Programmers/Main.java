package Programmers;

import Programmers.stack_queue.*;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionDevelopment solution = new FunctionDevelopment();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};	
		// return: [2,1]
		
		int[] answer = solution.solution(progresses, speeds);
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
	}

}
