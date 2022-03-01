/**
 * 다리를 지나는 트럭
 */

package Programmers.stack_queue;

import java.util.LinkedList;

/*
TruckPassingTheBridge solution = new TruckPassingTheBridge();

int bridge_length = 2;
int weight = 10;
int[] truck_weights = {7, 4, 5, 6};

System.out.println(solution.solution(bridge_length, weight, truck_weights));
*/

public class TruckPassingTheBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        // ����ϰ� �ִ� Ʈ����
        LinkedList<Truck> ready = new LinkedList<Truck>();
        // �ٸ��� �������� �ִ� Ʈ����
        LinkedList<Truck> passing = new LinkedList<Truck>();
        
        for (int i = 0; i < truck_weights.length; i++) {
        	Truck truck = new Truck(truck_weights[i], bridge_length);
        	ready.add(truck);
		}
        
        
        int time = 1;
        int current_weight = 0; // ���� �ٸ��� �ִ� Ʈ���� ���� ��
        
        while(!ready.isEmpty()) {
        	// �������� �ִ� ��� Ʈ���� leftTime�� 1�� ����
        	for (int j = 0; j < passing.size(); j++) {
				passing.get(j).leftTime--;
			}
        	
        	// �������� �ִ� Ʈ���� ù ��° Ʈ���� �ٸ��� ��� �ǳԴٸ� ����
        	Truck passingTruck = passing.peek(); 
        	if(!(passingTruck == null) && passingTruck.leftTime == 0) {
        		passing.poll();
        		current_weight -= passingTruck.weight;
        	}
        	
        	// ���� �ٸ� ���� �ִ� Ʈ���� ���� + ��� 1�� Ʈ���� ���� < �ٸ��� �ߵ� �� �ִ� ����
        	// �׷��ٸ� ��� 1�� Ʈ���� passing���� �̵�
        	Truck nextTruck = ready.peek();
        	if(current_weight + nextTruck.weight <= weight) {
        		passing.add(nextTruck);
        		current_weight += nextTruck.weight;
        		ready.poll();
        	}
        	
        	time++;
        }

        time += passing.peekLast().leftTime - 1;
        
        answer = time;
        return answer;
    }
}

class Truck {
	int weight;
	int leftTime;
	
	public Truck(int weight, int leftTime) {
		this.weight = weight;
		this.leftTime = leftTime;
	}
}