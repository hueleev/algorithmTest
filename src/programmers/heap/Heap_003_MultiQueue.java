package programmers.heap;

import java.util.*;

public class Heap_003_MultiQueue {
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (String opr : operations) {
            StringTokenizer st = new StringTokenizer(opr);
            int num = 0;
            switch (st.nextToken()) {
                case "I" : // 삽입
                    num = Integer.parseInt(st.nextToken());
                    maxQueue.add(num);
                    minQueue.add(num);
                    break;
                case "D":
                    if (st.nextToken().equals("1") && maxQueue.size() != 0) {
                        num = maxQueue.peek();
                    } else if (minQueue.size() != 0){
                        num = minQueue.peek();
                    }

                    if (num != 0) {
                        maxQueue.remove(num);
                        minQueue.remove(num);
                    }
                    break;
                default:
                    break;
            }
        }

        answer[0] = maxQueue.peek()==null? 0 : maxQueue.peek();
        answer[1] = minQueue.peek()==null? 0 : minQueue.peek();
        return answer;
    }
}
