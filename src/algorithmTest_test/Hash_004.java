package algorithmTest_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Hash_004 {
	
//	004. 베스트 앨범
//	
//	스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
//
//	속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//	장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//	장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
//	노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
//
//	제한사항
//	genres[i]는 고유번호가 i인 노래의 장르입니다.
//	plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
//	genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
//	장르 종류는 100개 미만입니다.
//	장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
//	모든 장르는 재생된 횟수가 다릅니다.

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
