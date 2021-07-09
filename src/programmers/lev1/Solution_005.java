package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_005 {

	/*
	005. ������ �������� ���� �迭
	array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
	divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

	���ѻ���
	arr�� �ڿ����� ���� �迭�Դϴ�.
	���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
	divisor�� �ڿ����Դϴ�.
	array�� ���� 1 �̻��� �迭�Դϴ�.
	����� ��
	arr	divisor	return
	[5, 9, 7, 10]	5	[5, 10]
	[2, 36, 1, 3]	1	[1, 2, 3, 36]
	[3,2,6]	10	[-1]
	����� �� ����
	����� ��#1
	arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.

	����� ��#2
	arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.

	����� ��#3
	3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
	*/
	
	private static int[] arr = {5,9,7,10};
	private static int divisor = 11;
	
	public static int[] solution() {
		
		List<Integer> ansArr = new ArrayList<Integer>();
		
		for (int num : arr) {
			if (num%divisor == 0) {
				ansArr.add(num);
			}
		}
		
		int[] answer = {};
		
		if (ansArr.size() == 0 ) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[ansArr.size()];
			for (int i=0; i<ansArr.size(); i++) {
				answer[i] = ansArr.get(i);
			}
		}

		Arrays.sort(answer);
		
		System.out.println(Arrays.toString(answer));
		
		//return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		return answer;
	}
}
