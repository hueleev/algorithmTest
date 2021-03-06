package programmers.stackQue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackQue_002 {

//	002. 다리를 지나는 트럭
//	
//	트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//	※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//
//	예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
//
//	경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
//	0	[]	[]	[7,4,5,6]
//	1~2	[]	[7]	[4,5,6]
//	3	[7]	[4]	[5,6]
//	4	[7]	[4,5]	[6]
//	5	[7,4]	[5]	[6]
//	6~7	[7,4,5]	[6]	[]
//	8	[7,4,5,6]	[]	[]
//	따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
//
//	solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
//
//	제한 조건
//	bridge_length는 1 이상 10,000 이하입니다.
//	weight는 1 이상 10,000 이하입니다.
//	truck_weights의 길이는 1 이상 10,000 이하입니다.
//	모든 트럭의 무게는 1 이상 weight 이하입니다.
	
	private static int bridge_length = 2;
	private static int weight = 10;
	private static int[] truck_weights = {7, 4, 5, 6};
	
	public static int solution() {
    	int answer = 0;
    	
    	int time = 0; // 시간
        int weightLeft = weight; // 남은 무게
        Truck truck = null;
        
        Queue<Truck> outside = new LinkedList<Truck>();
        List<Truck> inside = new ArrayList<Truck>();
        
        // 대기 트럭
    	for (int truckWeight : truck_weights) {
    		outside.add(new Truck(truckWeight, bridge_length));
    	}
    	
    	
    	// 모든 순간이 동시다발적으로 일어나야 한다.
    	while(!(inside.isEmpty()&&outside.isEmpty())) {
    		
    		// 가장 먼저 들어간 트럭이 다 건넌 경우
    		if (!inside.isEmpty() && inside.get(0).distance <=0) {
    			weightLeft += inside.get(0).weight;
    			inside.remove(0);
    		}
    		
    		// 트럭이 새로 들어가는 경우
    		if (!outside.isEmpty() && weightLeft - outside.peek().weight >= 0) {
    			weightLeft -= outside.peek().weight;
    			inside.add(outside.poll());
    		}
    		
    		// 전체 거리 --;
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