package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_019 {
	
	/*	
	 * 
	019. 자연수 뒤집어 배열로 만들기
	문제 설명
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

	제한 조건
	n은 10,000,000,000이하인 자연수입니다.
	입출력 예
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
