package lv5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Ex5 {
    public int solution(String str){
        int cnt=0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Ex5 T = new Ex5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
