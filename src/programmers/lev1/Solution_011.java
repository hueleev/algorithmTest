package programmers.lev1;

public class Solution_011 {

	/*
	
	011. �̻��� ���� �����
	���� ����
	���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

	���� ����
	���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
	ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
	����� ��
	s	return
	try hello world	TrY HeLlO WoRlD
	����� �� ����dd
	try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. ���� TrY HeLlO WoRlD �� �����մϴ�.
	
	 */
	
	private static String s = "sp ace asdf wefwef   sfawef";
	public static String solution() {
		String answer = "";
		String[] sList = s.split(" ", -1);
		
		for (String txtBlck : sList) {
			if (txtBlck.indexOf(" ") < 0) {
				for (int i=0; i<txtBlck.length(); i++) {
					String idxStr = String.valueOf(txtBlck.charAt(i));
					
					if (i%2 == 0) {
						answer += idxStr.toUpperCase();
					} else {
						answer += idxStr.toLowerCase();
					}
				}
				answer += " ";
			} else {
				answer += txtBlck;
			}
		}
		System.out.println(answer);
		return answer.substring(0, answer.length()-1);
	}
}
