/**
 * 체육복
 */

package Programmers.greedy;

import java.util.Arrays;

/*
GymSuit solution = new GymSuit();
		
int n = 5;
int[] lost = {2, 4};
int[] reserve = {1, 3, 5};
		

int n = 5;
int[] lost = {2, 4};
int[] reserve = {3};


int n = 3;
int[] lost = {3};
int[] reserve = {1};

System.out.println(solution.solution(n,lost,reserve));
*/

public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
    	int answer = n - lost.length;
    	
    	Arrays.sort(lost);
    	Arrays.sort(reserve);
    	
    	// ü������ �������� �л� ��, ������ ü������ �ִ� �л� ���� 
    	for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i]==reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
				}
			}
		}

    	
    	// ü������ �������� �л��� �� ���� �ִ� �л��� ������ ü������ �ִٸ� ����
    	for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(reserve[j] == lost[i]+1 || reserve[j] == lost[i]-1) {
					lost[i] = -1;
					reserve[j] = -1;
					answer++;
				}
			}
		}
    	
    	return answer;
    }
}
    	