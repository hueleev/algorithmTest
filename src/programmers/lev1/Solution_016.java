package programmers.lev1;

public class Solution_016 {

	/*
	 * 
	016. ���� ��ȣ
	���� ����
	� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�.
	���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

	���� ����
	������ �ƹ��� �о �����Դϴ�.
	s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
	s�� ���̴� 8000�����Դϴ�.
	n�� 1 �̻�, 25������ �ڿ����Դϴ�.
	����� ��
	s	n	result
	AB	1	BC
	z	1	a
	a B z	4	e F d
	
	*/
	
	private static String s = "a B z";
	private static int n = 4;
	
	public static String solution() {
		String answer = "";
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<s.length(); i++) {
			String idxStr = String.valueOf(s.charAt(i));
			int idx = 0;
			
			if (idxStr.equals(" ")) {
				answer += idxStr;
			} else if (upper.indexOf(idxStr) > -1) {
				idx = upper.indexOf(idxStr);
				idx = idx+n;
				if (idx >= upper.length()) {
					idx = idx%upper.length();
				}
				
				answer += upper.substring(idx, idx+1);
				
			} else if (lower.indexOf(idxStr) > -1) {
				idx = lower.indexOf(idxStr);
				idx = idx+n;
				if (idx >= lower.length()) {
					idx = idx%lower.length();
				}
				
				answer += lower.substring(idx, idx+1);
			}	
		}
		
		System.out.println(answer);
		
		return answer;
	}
}
