package programmers.lev1;

public class Solution_003 {

	/*	
	003. ��� ���� ��������
	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

	���ѻ���
	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
	����� ��
	s	return
	abcde	c
	qwer	we
	*/
	
	private static String s = "a";
	
	public static String solution() {
		
		String answer = "";
		
		int idx = (int) Math.floor(s.length()/2);
		
		if (s.length()%2 == 1) { // Ȧ��	
			answer = s.substring(idx, idx+1);
		} else {
			answer = s.substring(idx-1, idx) + s.substring(idx, idx+1);
		}
			
		System.out.println(answer);
		return answer;
	}
}
