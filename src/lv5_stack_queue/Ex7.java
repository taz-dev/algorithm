package lv5_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex7 {
    public String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char x : need.toCharArray()) {
            queue.offer(x);
        }
        for(char x : plan.toCharArray()){
            if(queue.contains(x)){
                if(x!=queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args){
        Ex7 T = new Ex7();
        Scanner kb = new Scanner(System.in);
        String need = kb.next();
        String plan = kb.next();
        System.out.println(T.solution(need, plan));
    }
}
