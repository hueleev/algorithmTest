package algorithmTest;


import programmers.heap.Heap_003_MultiQueue;
import programmers.stackQue.StackQue_006;

import java.util.*;

public class Main {;

    public static void main(String[] args){

        System.out.println(Arrays.toString(Heap_003_MultiQueue.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(Heap_003_MultiQueue.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
    }
/*
    private static int[][] solution(int servers, boolean sticky, int[] requests) {
        int[][] answer = new int[servers][servers];
        int chk = 0;
        int chk2 = 0;

        Queue<Integer> queue = new LinkedList<>();
        if (sticky) {
            Arrays.sort(requests);
        }
        for (int request : requests) {
            queue.add(request);
        }

        if (!sticky) {

            while(!queue.isEmpty()) {
                if (chk != servers) {
                    answer[chk][chk2] = queue.poll();
                } else {
                    chk2++;
                    chk = 0;
                    answer[0][chk2] = queue.poll();
                }
                chk++;
            }
        }
        return answer;
    }*/
}