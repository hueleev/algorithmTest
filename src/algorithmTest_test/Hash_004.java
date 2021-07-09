package algorithmTest_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Hash_004 {
	
//	004. ����Ʈ �ٹ�
//	
//	��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.
//
//	���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
//	�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
//	�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
//	�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
//
//	���ѻ���
//	genres[i]�� ������ȣ�� i�� �뷡�� �帣�Դϴ�.
//	plays[i]�� ������ȣ�� i�� �뷡�� ����� Ƚ���Դϴ�.
//	genres�� plays�� ���̴� ������, �̴� 1 �̻� 10,000 �����Դϴ�.
//	�帣 ������ 100�� �̸��Դϴ�.
//	�帣�� ���� ���� �ϳ����, �ϳ��� � �����մϴ�.
//	��� �帣�� ����� Ƚ���� �ٸ��ϴ�.

	private static String[] genres_example = {"classic","classic","pop","classic", "classic", "pop"};
	private static int[] plays_example = {500, 800, 600, 150, 800, 2500};
	
	
	public static int[] solution() {
        
		String[] genres = genres_example;
		int[] plays = plays_example;
		
        HashMap<String, List<Integer>> playMap = new HashMap<String, List<Integer>>();
        
        for (int i = 0; i < genres.length; i++ ) {
        	List<Integer> play = new ArrayList<Integer>();
        	
        	if (playMap.containsKey(genres[i])) {
        		play = playMap.get(genres[i]);
        		
        		if (!playMap.get(genres[i]).contains(plays[i])) {
        			play.add(plays[i]);
        			Collections.sort(play, Collections.reverseOrder());
            		
            		playMap.replace(genres[i], play);
        		}
        	} else {
        		play.add(plays[i]);
    			
        		playMap.put(genres[i], play);
        	}
        }
        
        List<String> genreOrd = new ArrayList<String>();
        List<Integer> numOrd = new ArrayList<Integer>();
        
        for (Object key : playMap.keySet().toArray()) {
        	genreOrd.add(key.toString());
        }
        
        
        for (int i = 0; i < genreOrd.size(); i++) {
        	int playNum = 0;
        	
        	List<Integer> playNums = playMap.get(genreOrd.get(i));
        	
        	for (int j = 0; j < playNums.size(); j++) {
        		playNum += playNums.get(j);
        	}
        	
        	numOrd.add(playNum);
        }
        
        for (int i = 0; i < genreOrd.size(); i++) {
	        for (int j = i + 1; j < genreOrd.size(); j ++) {
	    		if (numOrd.get(i) < numOrd.get(j)) {
	    			int cmpNum = numOrd.get(i);
	    			String cmpGenre = genreOrd.get(i);
	    			
	    			numOrd.set(i, numOrd.get(j));
	    			numOrd.set(j, cmpNum);
	    			
	    			genreOrd.set(i, genreOrd.get(j));
	    			genreOrd.set(j, cmpGenre);
	    		}; 
	    	}
        }
        
        int answerSize = 0;
        for (String key : playMap.keySet()) {
        	int valueSize = playMap.get(key).size();
        	
        	if (valueSize > 1) {
        		List<Integer> newValue = new ArrayList<>();
        		newValue.add(playMap.get(key).get(0));
        		newValue.add(playMap.get(key).get(1));
        		
        		playMap.replace(key, newValue);
        		answerSize += 2;
        	} else {
        		answerSize += valueSize;
        	}
        }
        
        System.out.println(genreOrd);
        System.out.println(numOrd);
        System.out.println();
        System.out.println(playMap);
        
        int[] answer = new int[answerSize];
        int ord = 0;
        
        for (int i = 0; i < genreOrd.size(); i++) {
        	String genre = genreOrd.get(i);
        	List<Integer> play = playMap.get(genreOrd.get(i));
        	
        	for (int j = 0; j < play.size(); j++) {
        		for (int k = 0; k < genres.length; k++) {
        			if ((genres[k]).equals(genre) && plays[k] == play.get(j)) {
        					System.out.println(ord +","+ plays[k]);
        					answer[ord] = k;
        					ord += 1;
        					break;
        			}
            	}
        	}
        }
        
        return answer;
    }
}
