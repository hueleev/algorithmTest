package programmers.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �ΰ� �̾Ƽ� ���ϱ�
 *
 * ���� �迭 numbers�� �־����ϴ�. numbers���� ���� �ٸ� �ε����� �ִ� �� ���� ���� �̾� ���ؼ� ���� �� �ִ� ��� ���� �迭�� ������������ ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 *
 * ���ѻ���
 * numbers�� ���̴� 2 �̻� 100 �����Դϴ�.
 * numbers�� ��� ���� 0 �̻� 100 �����Դϴ�.
 *
 * numbers		result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 */

public class Solution_021 {

    private static int[] numbers = {2,1,3,4,1};

    public static int[] solution() {
        List<Integer> answerList = new ArrayList<Integer>();

        for (int i=0; i<numbers.length - 1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!answerList.contains(sum)) {
                    answerList.add(sum);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
