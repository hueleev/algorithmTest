package algorithmTest_test;

public class Array_002 {

	/*
	 * 002. ���� ū ��
	0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

	���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.

	0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

	���� ����
	numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
	numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
	������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
	����� ��
	numbers	return
	[6, 10, 2]	6210
	[3, 30, 34, 5, 9]	9534330*/
	
	private static int[] numbers = {3, 30, 34, 5, 9};
	
	public static String solution() {
	
		int maxNumber = 0;
		int index = 0;
		String answerNumber = "";
		String answer = "";
		
		for (int j=0;j<numbers.length; j++) {
			for (int i = 0; i < numbers.length; i++) {
				
				int compareNumber = Integer.parseInt((String.valueOf(numbers[i])).substring(0,1));
				
				if(maxNumber == compareNumber) {
					if (Integer.parseInt(answerNumber) < numbers[i]) {
						maxNumber = compareNumber;
						answerNumber = String.valueOf(numbers[i]);
						index = i;
					}
				} else if (maxNumber < compareNumber){
					maxNumber = compareNumber;
					answerNumber = String.valueOf(numbers[i]);
					index = i;
				}
			}
			
			if (maxNumber != 0) {
				answer += answerNumber;
				numbers[index] = 0;
				index=0;
				maxNumber = 0;
			}
		}
		
		System.out.println(answer);
		return answer;
	}
}
