package programmers.lev1;

public class Solution_008 {

	/*
	
	008. ���ڿ� �� p�� y�� ����
	���� ����
	�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

	���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

	���ѻ���
	���ڿ� s�� ���� : 50 ������ �ڿ���
	���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
	����� ��
	s	answer
	pPoooyY	true
	Pyy	false
	����� �� ����
	����� �� #1
	'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

	����� �� #2
	'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
		
	*/
	
	private static String s = "pPoooyY";
	
	public static boolean solution() {
		boolean answer = false;
		
		int pCnt = 0;
		int yCnt = 0;
		
		for (int i=0; i<s.length(); i++) {
			if ("p".equalsIgnoreCase(s.substring(i, i+1))) {
				pCnt++;
			} else if ("y".equalsIgnoreCase(s.substring(i, i+1))) {
				yCnt++;
			}
		}
		
		if (pCnt == yCnt) {
			return true;
		} 
				

		/*s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();*/
		        
		return answer;
	}
}
