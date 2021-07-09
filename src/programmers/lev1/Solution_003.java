package programmers.lev1;

public class Solution_003 {

	/*	
	003. 가운데 글자 가져오기
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

	재한사항
	s는 길이가 1 이상, 100이하인 스트링입니다.
	입출력 예
	s	return
	abcde	c
	qwer	we
	*/
	
	private static String s = "a";
	
	public static String solution() {
		
		String answer = "";
		
		int idx = (int) Math.floor(s.length()/2);
		
		if (s.length()%2 == 1) { // 홀수	
			answer = s.substring(idx, idx+1);
		} else {
			answer = s.substring(idx-1, idx) + s.substring(idx, idx+1);
		}
			
		System.out.println(answer);
		return answer;
	}
}
