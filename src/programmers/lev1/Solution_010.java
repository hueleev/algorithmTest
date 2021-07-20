package programmers.lev1;

public class Solution_010 {

	
	/*
	 * 
	010. 문자열 다루기 기본
	문제 설명
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

	제한 사항
	s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	입출력 예
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
