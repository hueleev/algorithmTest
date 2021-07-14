package programmers.hash;

import java.util.*;

/*
		��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.

		���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
		�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
		�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
		�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

		���ѻ���
		genres[i]�� ������ȣ�� i�� �뷡�� �帣�Դϴ�.
		plays[i]�� ������ȣ�� i�� �뷡�� ����� Ƚ���Դϴ�.
		genres�� plays�� ���̴� ������, �̴� 1 �̻� 10,000 �����Դϴ�.
		�帣 ������ 100�� �̸��Դϴ�.
		�帣�� ���� ���� �ϳ����, �ϳ��� � �����մϴ�.
		��� �帣�� ����� Ƚ���� �ٸ��ϴ�.
		����� ��
		genres	plays	return
		["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
		����� �� ����
		classic �帣�� 1,450ȸ ����Ǿ�����, classic �뷡�� ������ �����ϴ�.

		���� ��ȣ 3: 800ȸ ���
		���� ��ȣ 0: 500ȸ ���
		���� ��ȣ 2: 150ȸ ���
		pop �帣�� 3,100ȸ ����Ǿ�����, pop �뷡�� ������ �����ϴ�.

		���� ��ȣ 4: 2,500ȸ ���
		���� ��ȣ 1: 600ȸ ���
		���� pop �帣�� [4, 1]�� �뷡�� ����, classic �帣�� [3, 0]�� �뷡�� �״����� �����մϴ�.

		�� ���� - 2019�� 2�� 28�� �׽�Ʈ���̽��� �߰��Ǿ����ϴ�.
*/

public class Hash_004_BestAlbum  {

    private static String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    private static int[] plays = {500, 600, 150, 800, 2500};

    public static int[] solution() {
        // �帣�� total ����� map
        Map<String, Integer> playMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            if (!playMap.containsKey(genre)) {
                int play = plays[i];
                playMap.put(genre, play);
            } else {
                int play = playMap.get(genre) + plays[i];
                playMap.put(genre, play);
            }
        }

        // ����� �� ����
        List<String> keySetList = new ArrayList<>(playMap.keySet());
        Collections.sort(keySetList, (o1, o2) -> (playMap.get(o2).compareTo(playMap.get(o1))));

        List<Integer> answerList = new ArrayList<>();
        for (String genre : keySetList) {
            Map<Integer, Integer> genreMap = new HashMap<>(); // �帣 index, ����� ��
            for (int i=0; i<genres.length; i++) {
                if (genre.equals(genres[i])) {
                    genreMap.put(i, plays[i]);
                }
            }

            // ����� �� ����
            List<Integer> idxList = new ArrayList<>(genreMap.keySet());
            Collections.sort(idxList, (o1, o2) -> (genreMap.get(o2).compareTo(genreMap.get(o1))));
            int limitChk = 0;
            for (Integer idx : idxList) {
                if (limitChk == 2) {
                    break;
                }
                answerList.add(idx);
                limitChk++;
            }
        }

        // list to array
        int[] answer = new int[answerList.size()];
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
