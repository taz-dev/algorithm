package lv6_sorting_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;
    //생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        //오름차순 : this - o -> 음수 값이 return 되도록
        //내림차순 : o - this -> 음수 값이 return 되도록
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point ob : arr) System.out.println(ob.x + " " + ob.y);
    }
}
