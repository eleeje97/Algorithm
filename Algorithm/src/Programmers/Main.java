package Programmers;

import Programmers.heap.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RamenFactory solution = new RamenFactory();

//		int stock = 4;
//		int[] dates = {4,10,15};
//		int[] supplies = {20,5,10};
//		int k = 30;
//		// return: 2

//		int stock = 4;
//		int[] dates = {4,10,18};
//		int[] supplies = {12,8,12};
//		int k = 30;
//		// return: 3
		
//		int stock = 4;
//		int[] dates = {1,2,3,4};
//		int[] supplies = {1,1,1,1};
//		int k = 6;
//		// return: 2

		int stock = 4;
		int[] dates = {2,4,10,15};
		int[] supplies = {15,20,5,3};
		int k = 30;
		// return: 2
		
		int answer = solution.solution(stock, dates, supplies, k);
		System.out.println(answer);
		
	}

}
