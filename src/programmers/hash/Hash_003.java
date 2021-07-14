package programmers.hash;

import java.util.HashMap;

public class Hash_003 {
	
//	003. ����
//	
//	�����̵��� ���� �ٸ� ���� �����Ͽ� �Ծ� �ڽ��� �����մϴ�.
//
//	���� ��� �����̰� ���� ���� �Ʒ��� ���� ���� �����̰� ���׶� �Ȱ�, �� ��Ʈ, �Ķ��� Ƽ������ �Ծ��ٸ� �������� û������ �߰��� �԰ų� ���׶� �Ȱ� ��� ���� ���۶󽺸� �����ϰų� �ؾ� �մϴ�.
//
//	����	�̸�
//	��	���׶� �Ȱ�, ���� ���۶�
//	����	�Ķ��� Ƽ����
//	����	û����
//	�ѿ�	�� ��Ʈ
//	�����̰� ���� �ǻ���� ��� 2���� �迭 clothes�� �־��� �� ���� �ٸ� ���� ������ ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	clothes�� �� ���� [�ǻ��� �̸�, �ǻ��� ����]�� �̷���� �ֽ��ϴ�.
//	�����̰� ���� �ǻ��� ���� 1�� �̻� 30�� �����Դϴ�.
//	���� �̸��� ���� �ǻ��� �������� �ʽ��ϴ�.
//	clothes�� ��� ���Ҵ� ���ڿ��� �̷���� �ֽ��ϴ�.
//	��� ���ڿ��� ���̴� 1 �̻� 20 ������ �ڿ����̰� ���ĺ� �ҹ��� �Ǵ� '_' �θ� �̷���� �ֽ��ϴ�.
//	�����̴� �Ϸ翡 �ּ� �� ���� �ǻ��� �Խ��ϴ�.

	private String[][] example = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};


	public int solution() {

		String[][] clothes = example;
		
        HashMap<String, Integer> cthMap = new HashMap<String, Integer>();
        
        for (String[] cth : clothes) {
            if (cthMap.containsKey(cth[1])) {
                cthMap.replace(cth[1], cthMap.get(cth[1])+1);
            } else {
                cthMap.put(cth[1], 1);
            }
        }
        
        int answer = 1;
        
        for (int value : cthMap.values()) {
            answer *= (value+1);
        }

        answer -= 1;
        return answer;
    }
}
