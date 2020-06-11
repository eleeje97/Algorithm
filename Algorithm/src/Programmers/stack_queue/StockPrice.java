/**
 * 주식가격
 */

package Programmers.stack_queue;

/*
StockPrice solution = new StockPrice();

int[] prices = {1, 2, 3, 2, 3};
int[] answer = solution.solution(prices);
for (int i = 0; i < answer.length; i++) {
	System.out.print(answer[i] + " ");
}
*/

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
			int count = 0;
			for (int j = i + 1; j < prices.length; j++) {
				count++;
				if(prices[i] > prices[j])
					break;
			}
			answer[i] = count;
		}
        return answer;
    }
}