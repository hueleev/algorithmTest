package programmers.stackQue;

import java.util.Stack;

public class StackQue_006 {
    public static boolean solution(String s) {
        boolean answer = true;
        if (s.startsWith(")")) {
            return false;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i=0; i<s.length(); i++) {
                // ( 면 stack에 쌓고, ) 이면 stack을 뺀다.
                if (s.charAt(i) == '(') {
                    stack.push('(');
                } else {
                    if (stack.empty()) { // ) 인데 stack이 비어있으면 NO
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()) {
                answer = false;
            }
        }
        return answer;
    }
}
