package programmers.lev1;

import java.util.ArrayList;
import java.util.List;

public class Solution_001 {

	/*
	001. ���ǰ��
	�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

	1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

	1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

	���� ����
	������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
	������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
	���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
	����� ��
	answers	return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
	����� �� ����
	����� �� #1

	������ 1�� ��� ������ �������ϴ�.
	������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
	������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
	���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

	����� �� #2

	��� ����� 2�������� ������ϴ�.*/
	
	private static int[] answers = {1, 3, 2, 4, 2};
	
	public static int[] solution() {
		int[] per1 = new int[10000];
		int[] per2 = new int[10000];
		int[] per3 = new int[10000];
		
		int[] ans1 = {1,2,3,4,5};
		int[] ans2 = {2,1,2,3,2,4,2,5};
		int[] ans3 = {3,3,1,1,2,2,4,4,5,5};
		
		for (int i=0; i<10000; i++) {
			per1[i] = ans1[i%(ans1.length)];
			per2[i] = ans2[i%(ans2.length)];
			per3[i] = ans3[i%(ans3.length)];
		}
		
		int[] corr = {0, 0, 0};
		
		for (int i=0; i<answers.length; i++) {
			if (per1[i] == answers[i]) {
				corr[0]++;
			}
			if (per2[i] == answers[i]) {
				corr[1]++;
			}
			if (per3[i] == answers[i]) {
				corr[2]++;
			}
		}
		
		
		List<Integer> ansArr = new ArrayList<Integer>();
		
		int maxCorr = 1;
		for (int i =0; i<corr.length; i++) {
			if (maxCorr < corr[i]) {
				maxCorr = corr[i];
			}
		}
		
		
		for (int i=0; i<corr.length; i++) {
			if (corr[i] == maxCorr) {
				ansArr.add(i+1);
			}
		}
	
		int[] answer = new int[ansArr.size()];
		
		for (int i=0; i<ansArr.size(); i++) {
			answer[i] = (int) ansArr.get(i);
		}
		
		return answer;
	}
}
