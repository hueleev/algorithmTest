package programmers.stackQue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackQue_002 {

//	002. �ٸ��� ������ Ʈ��
//	
//	Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
//	�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.
//
//	���� ���, ���̰� 2�̰� 10kg ���Ը� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.
//
//	��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��	��� Ʈ��
//	0	[]	[]	[7,4,5,6]
//	1~2	[]	[7]	[4,5,6]
//	3	[7]	[4]	[5,6]
//	4	[7]	[4,5]	[6]
//	5	[7,4]	[5]	[6]
//	6~7	[7,4,5]	[6]	[]
//	8	[7,4,5,6]	[]	[]
//	����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.
//
//	solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. �̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
//
//	���� ����
//	bridge_length�� 1 �̻� 10,000 �����Դϴ�.
//	weight�� 1 �̻� 10,000 �����Դϴ�.
//	truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
//	��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.
	
	private static int bridge_length = 2;
	private static int weight = 10;
	private static int[] truck_weights = {7, 4, 5, 6};
	
	public static int solution() {
    	int answer = 0;
    	
    	int time = 0; // �ð�
        int weightLeft = weight; // ���� ����
        Truck truck = null;
        
        Queue<Truck> outside = new LinkedList<Truck>();
        List<Truck> inside = new ArrayList<Truck>();
        
        // ��� Ʈ��
    	for (int truckWeight : truck_weights) {
    		outside.add(new Truck(truckWeight, bridge_length));
    	}
    	
    	
    	// ��� ������ ���ôٹ������� �Ͼ�� �Ѵ�.
    	while(!(inside.isEmpty()&&outside.isEmpty())) {
    		
    		// ���� ���� �� Ʈ���� �� �ǳ� ���
    		if (!inside.isEmpty() && inside.get(0).distance <=0) {
    			weightLeft += inside.get(0).weight;
    			inside.remove(0);
    		}
    		
    		// Ʈ���� ���� ���� ���
    		if (!outside.isEmpty() && weightLeft - outside.peek().weight >= 0) {
    			weightLeft -= outside.peek().weight;
    			inside.add(outside.poll());
    		}
    		
    		// ��ü �Ÿ� --;
    		for (int i=0; i<inside.size(); i++) {
    			inside.get(i).distance--;
    		}
    		
    		time++;
    	}
    	
        return answer;
    }
	
}

class Truck {
    int weight;
    int distance;
    
    public Truck(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }
}