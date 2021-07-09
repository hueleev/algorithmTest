package programmers.lev1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_007 {

	
	/*
	007. ���ڿ� �� ������� �����ϱ�
	���� ����
	���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

	���� ����
	strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
	strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
	strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
	��� strings�� ������ ���̴� n���� Ů�ϴ�.
	�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
	����� ��
	strings	n	return
	[sun, bed, car]	1	[car, bed, sun]
	[abce, abcd, cdx]	2	[abcd, abce, cdx]
	����� �� ����
	����� �� 1
	sun, bed, car�� 1��° �ε��� ���� ���� u, e, a �Դϴ�. �̸� �������� strings�� �����ϸ� [car, bed, sun] �Դϴ�.

	����� �� 2
	abce�� abcd, cdx�� 2��° �ε��� ���� c, c, x�Դϴ�. ���� ���� �Ŀ��� cdx�� ���� �ڿ� ��ġ�մϴ�.
	abce�� abcd�� ���������� �����ϸ� abcd�� �켱�ϹǷ�, ���� [abcd, abce, cdx] �Դϴ�.
	*/
	
	private static String[] strings = {"abce", "abcd","cdx"};
	private static int n = 2;
	
	public static String[] solution() {
		
		for (int i=0; i<strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		
		Arrays.sort(strings);
		
		String[] answer = new String[strings.length];
		
		for (int i=0; i<strings.length; i++) {
			answer[i] = strings[i].substring(1, strings[i].length());
		}
		
		return answer;
	}
}
