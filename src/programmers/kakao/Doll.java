package programmers.kakao;

import java.util.LinkedList;

public class Doll {

    private static int[][] board = {{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    private static int[] moves = {1,5,3,5,1,2,1,4};

    public static int solution() {
        int answer = 0;
        LinkedList<Integer> basket = new LinkedList<Integer>();

        for (int move : moves) {
            move = move - 1;
            for (int i=0; i < board.length; i++) {
                int doll = board[i][move];
                if (doll == 0) {
                    continue;
                } else {
                    if (basket.size() != 0) {
                        if (basket.get(basket.size() -1) == doll) {
                            basket.remove(basket.size() -1);
                            answer += 2;
                        } else {
                            basket.add(doll);
                        }
                    } else {
                        basket.add(doll);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
