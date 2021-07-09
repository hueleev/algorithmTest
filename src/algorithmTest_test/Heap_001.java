package algorithmTest_test;

//	001. �� �ʰ�
//	
//	�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. ��� ������ ���ں� ������ K �̻����� ����� ���� Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.
//	
//	���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
//	Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
//	Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, ��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//	
//	���� ����
//	scoville�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
//	K�� 0 �̻� 1,000,000,000 �����Դϴ�.
//	scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
//	��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.
		
public class Heap_001 {

	private static int[] scoville = {1, 2, 3, 9, 10, 12};
	private static int K = 7;
	
	public static int solution() {
		int minScoville = 0;
		
		for (int i = 1; i < scoville.length; i++) {
			minScoville = ( scoville[minScoville] > scoville[i] ? i : minScoville );
		}
		
		return 0;
	}
	
	public static int calc(int a, int b) {
		return a + ( b *2 );
	}
}
