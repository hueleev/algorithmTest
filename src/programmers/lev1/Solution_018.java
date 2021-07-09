package programmers.lev1;

public class Solution_018 {

	/*
	
	018. �ڸ��� ���ϱ�
	���� ����
	�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
	������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

	���ѻ���
	N�� ���� : 100,000,000 ������ �ڿ���
	����� ��
	N	answer
	123	6
	987	24
	����� �� ����
	����� �� #1
	������ ���ÿ� �����ϴ�.

	����� �� #2
	9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
			
	*/
	
	private static int n = 123;
	
	public static int solution() {
		int answer = 0;
		
		String nStr = String.valueOf(n);
		
		for (int i=0; i<nStr.length(); i++) {
			String idx = String.valueOf(nStr.charAt(i));
			answer+=Integer.parseInt(idx);
		}
		
		
		/*while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }*/
		
		return answer;
	}
	
}
