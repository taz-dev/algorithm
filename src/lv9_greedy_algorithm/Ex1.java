package lv9_greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.w - this.w; //몸무게로 내림차순
    }
}

public class Ex1 {
    public int solution(ArrayList<Body> arr, int n) {
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).h > max) {
                max = arr.get(i).h;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
