package Programmers;

import Programmers.stack_queue.*;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tower solution = new Tower();
		//int[] heights = {6,9,5,7,4};	//[0,0,2,2,4]
		//int[] heights = {3,9,9,3,5,7,2};	//[0,0,0,3,3,3,6]
		int[] heights = {1,5,3,6,7,6,5};	//[0,0,2,0,0,5,6]
		int[] answer = solution.solution(heights);
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
	}

}
