package algorithmTest_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackQue_004 {

//	004. ������
//	
//	�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. �̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
//
//	1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
//	2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
//	3. �׷��� ������ J�� �μ��մϴ�.
//	���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� �߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.
//
//	���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. ���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.
//
//	���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
//	�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
//	location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ ������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.
	
	private static int[] priorities = {2, 1, 3, 2};
	private static int location = 2;
	
	public static int solution() {
        int answer = 0;
        
        Queue<Printing> printList = new LinkedList<Printing>();
        
        List<Boolean> printed = new ArrayList<Boolean>();
        
        for (int i=0; i<priorities.length; i++) {
        	if (i == location) {
        		printList.add(new Printing(priorities[i], true));
        	} else {
        		printList.add(new Printing(priorities[i], false));
        	}
        }
        
        while (printList.size() != 0) {
        	for (int j=1; j<printList.size(); j++) {
        		int prints = printList.poll().priority;
        		
//        		if (prints < printList.peek(j).priority) {
//        			printList.remove(0);
//        			printed.add()..
//        		}
        	}
        }
        
        
        return answer;
    }
}

class Printing {
	int priority;
	boolean mine;
	
	public Printing(int priority, boolean mine) {
		this.priority = priority;
		this.mine = mine;
	}
}