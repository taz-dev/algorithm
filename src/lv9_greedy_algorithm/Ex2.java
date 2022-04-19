package lv9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) {
            //끝나는 시간이 같으면 시작 시간으로 오름차순
            return this.s - o.s;
        } else {
            //끝나는 시간으로 오름차순
            return this.e = o.e;
        }
    }
}

public class Ex2 {
    public int solution(ArrayList<Time> arr, int n) {
        int answer = 0;
        Collections.sort(arr);
        int endTime = 0;

        for (Time ob : arr) {
            if (ob.s >= endTime) {
                answer++;
                endTime = ob.e;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Ex2 T = new Ex2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Time(s, e));
        }
        System.out.println(T.solution(arr, n));
    }
}
