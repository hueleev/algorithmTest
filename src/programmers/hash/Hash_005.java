package programmers.hash;

import java.util.HashMap;

public class Hash_005 {
    public static int solution(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return Math.min(nums.length / 2, map.size());
    }
}
