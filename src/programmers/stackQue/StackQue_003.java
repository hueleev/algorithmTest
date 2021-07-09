package programmers.stackQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackQue_003 {

//	003.��� ����
//	
//	���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
//
//	��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
//
//	���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
//
//	���� ����
//	�۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
//	�۾� ������ 100 �̸��� �ڿ����Դϴ�.
//	�۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
//	������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.
//	����� ��
//	progresses	speeds	return
//	[93,30,55]	[1,30,5]	[2,1]
	
	private static int[] progresses = {93,30,55};
	private static int[] speeds = {1,30,5};
	
	public static int[] solution() {
        
        List<Integer> day = new ArrayList<Integer>();
        
        for (int i=0; i<progresses.length; i++) {	
        	while (progresses[i] < 100) {
        		if (day.size() != i+1) {
        			day.add(1);
        		} else {
        			day.set(i, day.get(i)+1);
        		}
        		
        		progresses[i] += speeds[i];
        	}
        }
        
        
        List<Work> works = new ArrayList<Work>();
        
        for (int i=0; i<day.size(); i++) {
        	if (works.size() == 0) {
        		works.add(new Work(day.get(i), 1));
        	}
			else {
        		if (works.get(works.size()-1).workDay >= day.get(i)) {
            		works.get(works.size()-1).workSize++;
            	} else {
            		works.add(new Work(day.get(i), 1));
            	}
        	}
        }
        
        int[] answer = new int[works.size()];
        
        for (int i=0; i<works.size(); i++) {
        	answer[i] = works.get(i).workSize;
        }
        
        
        return answer;
    }
}

class Work {
	int workDay;
	int workSize;
	
	public Work(int workDay, int workSize) {
		this.workDay = workDay;
		this.workSize = workSize;
	}
}
