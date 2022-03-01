/**
 * 쇠막대기
 */

package Programmers.stack_queue;

/*
IronBar solution = new IronBar();

String arrangement = "()(((()())(())()))(())"; // 17
//String arrangement = "(((()(()()))(())()))(()())"; // 24

System.out.println(solution.solution(arrangement));
*/

public class IronBar {
    public int solution(String arrangement) {
        int answer = 0;
        
        arrangement =arrangement.replace("()", " "); // ������ �κ��� �������� replace
        char[] array = arrangement.toCharArray();
        
        for (int i = 0; i < array.length; i++) {
			if(array[i] == '(') {
				answer = answer + getLaserCount(i, array) + 1;
			}
		}
		
        return answer;
    }
    
    public int getLaserCount(int startIndex, char[] array) {
    	int level = 0; // ��ȣ�� ����
    	char now = array[startIndex]; // ���� ��ȣ ���
    	int laser = 0; // ������ ����
    	
    	for (int i = startIndex+1; i < array.length; i++) {
			if(array[i]!=' ') {
				if(array[i] == now) {
					if(array[i] == '(')
						level++;
					else
						level--;
				}
				now = array[i];
				
				if(level == 0) {
					break;
				}
			} else {
				laser++;
			}
		}
    	
    	return laser;
    }
}