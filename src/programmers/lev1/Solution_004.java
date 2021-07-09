package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_004 {

	
	/*
	004. ���� ���ڴ� �Ⱦ�
	�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,

	arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
	arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
	�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

	���ѻ���
	�迭 arr�� ũ�� : 1,000,000 ������ �ڿ���
	�迭 arr�� ������ ũ�� : 0���� ũ�ų� ���� 9���� �۰ų� ���� ����
	����� ��
	arr	answer
	[1,1,3,3,0,1,1]	[1,3,0,1]
	[4,4,4,3,3]	[4,3]
	*/
	
	private static int[] arr = {1,1,3,3,0,1,1};
	
	public static int[] solution() {
		
		List<Integer> ansArr = new ArrayList<Integer>();
		ansArr.add(arr[0]);
		
		for (int i=1; i<arr.length; i++) {
			int lastVal = ansArr.get(ansArr.size()-1);
			if (lastVal != arr[i]) {
				ansArr.add(arr[i]);
			}
		}
		
		int[] answer = new int[ansArr.size()];
		
		for (int i=0; i<ansArr.size(); i++) {
			answer[i] = ansArr.get(i);
		}
		
		return answer;
	}
}
