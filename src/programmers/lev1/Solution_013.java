package programmers.lev1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_013 {

	/*
	013. ���ڿ� ������������ ��ġ�ϱ�
	���� ����
	���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

	���� ����
	str�� ���� 1 �̻��� ���ڿ��Դϴ�.
	����� ��
	s	return
	Zbcdefg	gfedcbZ
	*/
	
	private static String s = "Zbcdefg";
	
	public static String solution() {
		String answer="";
		
		String[] arr = new String[s.length()];
		
		for (int i=0; i<s.length(); i++) {
			arr[i] = String.valueOf(s.charAt(i));
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for (int i=0; i<arr.length; i++) {
			answer+=arr[i];
		}
		
		return answer;
	}
}
