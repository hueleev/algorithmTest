package programmers.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_003_MultiQueue {
    public static void main(String[] args) {
        String[] ex1 = {"I 16","D 1"};
        String[] ex2 = {"I 7","I 5","I -5","D -1"};
        solution(ex1);
        solution(ex2);
    }
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (String opr : operations) {
            String[] sOpr = opr.split(" ");

            switch (sOpr[0]) {
                case "I" : // 삽입
                    maxQueue.add(Integer.parseInt(sOpr[1]));
                    minQueue.add(Integer.parseInt(sOpr[1]));
                    break;
                case "D":
                    int removeQueue = 0;
                    if (sOpr[1].equals("1")) {
                        removeQueue = maxQueue.peek();
                    } else {
                        removeQueue = minQueue.peek();
                    }

                    maxQueue.remove(removeQueue);
                    minQueue.remove(removeQueue);
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
