package lv4_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char y : b.toCharArray()) {
            if (!map.containsKey(y) || map.get(y) == 0) return "NO";
            map.put(y, map.get(y) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
}
