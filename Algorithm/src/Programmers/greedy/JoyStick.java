/**
 * 조이스틱
 */

package Programmers.greedy;

import java.util.Arrays;

/*
		JoyStick solution = new JoyStick();
		
		//String name = "SAANA"; // 8+13 + 2 = 15��
		//String name = "JAZ"; // 11��
		//String name = "JAN"; // 23��
		//String name = "JEROEN"; // 56��
		//String name = "AAAAA"; // 0��
		//String name = "BAABAABA"; // 3 + 5 = 8��
		
		// �Ʒ� �� ���̽��� left, right �Ѵ� 'A'�� �ƴ� ���ĺ��� �� ����/������ ��� ���� �����Ŀ� ���� �޶��� -> ����
		String name = "BBAABB"; // 4 + 4 = 8��
		//String name = "BBBAAAB"; // 4 + 4 = 8��

		
		System.out.println(solution.solution(name));
 */


public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        
        int[] temp = new int[name.length()];
        // ���� ��ġ�� ���� A�� �ƴ� ���ڰ� ��Ÿ���� ���� ����� ������ �̵�
        for (int i = 1; i < name.length(); i++) {
			if(name.charAt(i) == 'A') {
				temp[i] = 0;
			} else {
				temp[i] = 1;
			}
		}
        
        //System.out.println(Arrays.toString(temp));
        
        int index = 0;
        int innerIndex = 0;
        while(Arrays.stream(temp).sum() != 0) {
        	int left = index-1, right = index+1;
        	while(true) {
        		// �ε����� ������ ��� ��� ����
        		if(left < 0) {
        			left = temp.length + left;
        		}
        		if(right >= temp.length) {
        			right = right - temp.length;
        		}
        		
        		if(temp[left] + temp[right] == 2) {
        			innerIndex = right; // �� �κ��� ����: right���� left������ ���� ����ϴ� ���̽�/���ϴ� ���̽��� ����
        			break;
        		} else if(temp[left] + temp[right] == 0) {
        			left--;
        			right++;
        		} else if (temp[left] > temp[right]) {
        			innerIndex = left;
        			break;
        		} else {
        			innerIndex = right;
        			break;
        		}
        	}
        	
        	//System.out.println("innerIndex:"+innerIndex);
        	int dist = Math.abs(index - innerIndex);
        	if(dist > temp.length/2) {
        		dist = temp.length - dist;
        	} 
        	answer += dist;
        	index = innerIndex;
        	temp[index] = 0;
        	//System.out.println(Arrays.toString(temp));
        	 
        }
        
        //System.out.println("�ڸ� �̵� Ƚ��: " + answer);
        
        
        
        // �� �ڸ��� ���ĺ��� �̵� ������ ����
        for (int i = 0; i < name.length(); i++) {
			answer += getDistance(name.charAt(i));
			//System.out.println(name.charAt(i)+": "+getDistance(name.charAt(i)));
		}
        
        return answer;
    }
    
    
    int getDistance(char ch) {
    	int distance = ch - 'A';
    	
    	if(distance > 13) {
    		return (26 - distance);
    	} else {
    		return distance;
    	}
    	
    }
}