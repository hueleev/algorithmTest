package programmers.lev1;

public class Solution_014 {
	
	/*
	
	014. ���ڼ��ڼ��ڼ��ڼ�?
	���� ����
	���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
	
	���� ����
	n�� ���� 10,000������ �ڿ����Դϴ�.
	����� ��
	n	return
	3	���ڼ�
	4	���ڼ���
	
	*/
	
	private static int n = 5;
	
	public static String solution() {
		String answer = "";
		
		for (int i=1; i<=n; i++) {
			if (i%2 == 1) {
				answer += "��";
			} else {
				answer += "��";
			}
		}
		
        return answer;
	}

}
