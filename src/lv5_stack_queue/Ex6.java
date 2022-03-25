package lv5_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex6 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()){
            for(int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Ex6 T = new Ex6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
}
