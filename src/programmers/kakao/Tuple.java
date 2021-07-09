package programmers.kakao;

import java.util.*;

public class Tuple {

    private static String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
    public static int[] soultion() {
        s = s.replaceAll("[{}]","");
        String[] arr = s.split(",");

        Map<String, Integer> map = new HashMap<>();
        for (String number : arr) {
            if (map.containsKey(number)) {
                map.replace(number, map.get(number) + 1);
                continue;
            }
            map.put(number, 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,Collections.reverseOrder(Map.Entry.comparingByValue()));
        System.out.println(list);

        int[] answer = new int[map.size()];
        int i=0;
        for(Map.Entry<String,Integer> entry : list){
            answer[i] = Integer.parseInt(entry.getKey());
            i++;
        }

        return answer;
    }
}
