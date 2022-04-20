package lv9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture o){
        return o.time - this.time;
    }
}

public class Ex4 {
    static int n, max=Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).time < i) break;
                queue.offer(arr.get(j).money);
            }
            if (!queue.isEmpty()) answer += queue.poll();
        }
        return answer;
    }

    public static void main(String[] args){
        Ex4 T = new Ex4();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = kb.nextInt();
            int time = kb.nextInt();
            arr.add(new Lecture(money, time));
            if (time > max) max = time;
        }
        System.out.println(T.solution(arr));
    }
}
