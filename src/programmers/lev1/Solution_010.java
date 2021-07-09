package programmers.lev1;

public class Solution_010 {

	
	/*
	 * 
	010. ���ڿ� �ٷ�� �⺻
	���� ����
	���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

	���� ����
	s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
	����� ��
	s	return
	a234	false
	1234	true
	
	*/
	
	private static String s = "a1234";
	
	public static boolean solution() {
		boolean answer = true;
		String cmp = "1234567890";
		
		int sSize = s.length();
		
		if (sSize == 4 || sSize == 6) {
			for (int i=0; i<s.length(); i++) {
				if (cmp.indexOf(s.charAt(i)) < 0) {
					answer = false;
				}
			}
		} else {
			answer = false;
		}
		
		return answer;
	}
}
