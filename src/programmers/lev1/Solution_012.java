package programmers.lev1;

public class Solution_012 {

	/*
	
	012. 2016��
	���� ����
	2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT

	�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

	���� ����
	2016���� �����Դϴ�.
	2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
	����� ��
	a	b	result
	5	24	TUE
	
	*/
	
	private static int a = 1;
	private static int b = 8;
	
	public static String solution() {
		String answer="";
		
		int[] month = {6,2,3,6,1,4,6,2,5,7,3,5};
		
		String[] weekDays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int idx = (month[a-1] + b - 2) % 7;
		System.out.println(idx);
		answer = weekDays[idx];
		System.out.println(answer);
		return answer;
	}
}
