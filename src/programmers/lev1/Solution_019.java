package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_019 {
	
	/*	
	 * 
	019. �ڿ��� ������ �迭�� �����
	���� ����
	�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

	���� ����
	n�� 10,000,000,000������ �ڿ����Դϴ�.
	����� ��
	n	return
	12345	[5,4,3,2,1]
		
	*/
	
	private static int n = 12345;
	
	public static int[] solution() {
		String nStr = String.valueOf(n);
		
		int[] answer = new int[nStr.length()];
		
		for (int i = nStr.length()-1; i >=0; i--) {
			String sStr = String.valueOf(nStr.charAt(i));
			int s = Integer.parseInt(sStr);
			answer[nStr.length()-1-i] = s;
		}
		
		return answer;
	}
	
}
