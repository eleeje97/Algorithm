package Programmers;

import Programmers.hash.BestAlbum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BestAlbum solution = new BestAlbum();
		String[] genres	= {"classic", "pop", "classic", "classic", "pop"}; //"classic", "classic", "classic", "pop"
		int[] plays = {500, 600, 150, 800, 2500}; //500, 600, 150, 800, 2500
		//answer: [4, 1, 3, 0]
		
		int[] answer = solution.solution(genres, plays);
		for (int i : answer) {
			System.out.print(i + " ");
		}
		
	}

}
