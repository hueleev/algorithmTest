package programmers.lev1;

public class Solution_006 {
	
	/*
	006. �� ���� ������ ��
	���� ����
	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

	���� ����
	a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
	a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
	a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
	����� ��
	a	b	return
	3	5	12
	3	3	3
	5	3	12
	*/
	
	private static int a = 3;
	private static int b = 5;
	
	public static long solution() {
		long answer = 0;
		
		int startNum = 0;
		int endNum = 0;
		
		if (a < b) {
			startNum = a; endNum = b;
		} else {
			endNum = a; startNum = b;
		}
		
		for (int i = startNum; i <= endNum; i++) {
			answer += i;
		}
		
		return answer;
	}
}
