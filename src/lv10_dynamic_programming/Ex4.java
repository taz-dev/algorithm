package lv10_dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s, h, w;
    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Ex4 {
    static int[] dy;
    public int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr); //넓이 내림차순 정렬
        dy[0] = arr.get(0).h; //가장 넓은 사각형의 높이를 저장
        answer = dy[0];

        for (int i = 1; i < arr.size(); i++) {
            int max_h = 0;
            for (int j = i-1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Brick(s, h, w));
        }
        System.out.println(T.solution(arr));
    }
}
