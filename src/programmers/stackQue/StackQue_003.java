package programmers.stackQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackQue_003 {

//	003.기능 개발
//	
//	프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//
//	또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//
//	먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
//
//	제한 사항
//	작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
//	작업 진도는 100 미만의 자연수입니다.
//	작업 속도는 100 이하의 자연수입니다.
//	배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
//	입출력 예
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

		System.out.println(day.toString());

		// 배포 관련 work
        List<Work> works = new ArrayList<Work>();
        
        for (int i=0; i<day.size(); i++) {
        	if (works.size() == 0) {
				// 첫번째 배포일에는 무조건 첫번째 작업이 배포됨.
        		works.add(new Work(day.get(i), 1));
        	}
			else {
				// 이전 배포소요기간 보다 다음 작업기간이 적으면
				// 이전 배포소요기간 내에 작업이 완료되므로 같이 배포 (+1)
        		if (works.get(works.size()-1).workDay >= day.get(i)) {
            		works.get(works.size()-1).workSize++;
            	} else {
					// 이전 배포 소요기간보다 더 오래 걸릴 경우, 다음 배포일자 추가
            		works.add(new Work(day.get(i), 1));
            	}
        	}
			System.out.println(works.toString());
        }
        
        int[] answer = new int[works.size()];
        
        for (int i=0; i<works.size(); i++) {
        	answer[i] = works.get(i).workSize;
        }
        
        
        return answer;
    }
}

class Work {
	int workDay; // 배포소요기간
	int workSize; // 배포갯수
	
	public Work(int workDay, int workSize) {
		this.workDay = workDay;
		this.workSize = workSize;
	}

	@Override
	public String toString() {
		return "Work{" +
				"workDay=" + workDay +
				", workSize=" + workSize +
				'}';
	}
}
