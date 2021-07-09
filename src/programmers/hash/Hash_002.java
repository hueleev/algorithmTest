package programmers.hash;

public class Hash_002 {

	
//	002. ��ȭ ��ȣ ���
//	
//	��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
//	��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
//
//	������ : 119
//	���ؿ� : 97 674 223
//	������ : 11 9552 4421
//	��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���� ����
//	phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
//	�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
	
	private static String[] example = {"119", "97674223", "1195524421"};

    public static boolean solution() {
    	String[] phone_book = example;
    	
    	String minNum = phone_book[0];
         
        for (String phoneNum : phone_book) {
            if (phoneNum.length() < minNum.length()) {
                minNum = phoneNum;
            }
        }
        
        for (String phoneNum : phone_book) {
            if (phoneNum != minNum) {
                String cmpNum = phoneNum.substring(0, minNum.length());
                if (cmpNum.equals(minNum)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
