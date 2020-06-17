package Programmers;

import Programmers.stack_queue.*;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer solution = new Printer();
		
		//int[] priorities = {2,1,3,2};
		//int location = 2;
		// return: 1
		
		//int[] priorities = {1,1,9,1,1,1};
		//int location = 0;
		// return: 5
		
		int[] priorities = {1,8,2,3,7,2,2};
		int location = 6;
		// return: 5
		
		int answer = solution.solution(priorities, location);
		System.out.println(answer);
		
	}

}
