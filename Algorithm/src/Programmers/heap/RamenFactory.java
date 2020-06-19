/**
 * 라면 공장
 *
 * (밀가루가 공급되는 date <= 현재 stock)인 모든 날 중, supply가 가장 큰 date를 선택
 * stock에 선택한 date의 supply를 더하기
 * (stock >= k) 일 때까지 위의 과정 반복
 */

package Programmers.heap;

import java.util.*;

public class RamenFactory {

    /*
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
     */
	
	public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        // 우선순위 큐에 (date, supply) 저장
        PriorityQueue<SupplyPlan> supplyPlans = new PriorityQueue();
        for (int i = 0; i < dates.length; i++) {
            supplyPlans.add(new SupplyPlan(dates[i], supplies[i]));
        }


        SupplyPlan supplyPlan;
        ArrayList<SupplyPlan> templist = new ArrayList<>();
        while(stock < k) {
            supplyPlan = supplyPlans.poll();
            System.out.println("현재 supplyPlan: " + supplyPlan.date + ", " + supplyPlan.supply);
            if (supplyPlan.date <= stock) {
                stock += supplyPlan.supply;
                answer++;
                for (SupplyPlan sp : templist) {
                    supplyPlans.add(sp);
                }
                templist.clear();
            } else {
                templist.add(supplyPlan);
            }
        }


        return answer;
    }

    class SupplyPlan implements Comparable<SupplyPlan> {
	    int date;
	    int supply;

	    public SupplyPlan(int date, int supply) {
	        this.date = date;
	        this.supply = supply;
        }

        @Override
        public int compareTo(SupplyPlan o) {
	        if (this.supply < o.supply)
	            return 1;
	        else if (this.supply > o.supply) {
	            return -1;
            } else {
                if (this.date > o.date) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }

}
