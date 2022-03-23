package lv5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Ex4 {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int first = stack.pop();
                int second = stack.pop();
                if (x == '+') stack.push(second + first);
                else if (x == '-') stack.push(second - first);
                else if (x == '*') stack.push(second * first);
                else if (x == '/') stack.push(second / first);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
