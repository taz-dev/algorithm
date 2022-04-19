package lv9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Wedding implements Comparable<Wedding> {
    public int time;
    public char state;

    public Wedding(int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Wedding o) {
        if (this.time == o.time) {
            //시간이 같으면 상황에 따라 오름차순
            //'e' 먼저 's' 나중
            return this.state - o.state;
        } else {
            //시간으로 오름차순
            return this.time - o.time;
        }
    }
}

public class Ex3 {
    public int solution(ArrayList<Wedding> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0; //현재 몇 명이 존재하는지

        for (Wedding ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt); //answer가 cnt보다 크면 교체
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Wedding> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = kb.nextInt();
            int et = kb.nextInt();
            arr.add(new Wedding(st, 's'));
            arr.add(new Wedding(et, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}