package lv4_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
    public char solution(int n , String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            //System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        //HashMap에서 기억해야 할 메서드
        map.put('A', map.getOrDefault('A', 0) + 1);
        map.getOrDefault('A', 0);
        map.keySet(); //map 객체 탐색
        map.get('A'); //특정 key 갯수
        map.containsKey('A'); //true or false 출력
        map.size(); //key의 갯수
        map.remove('A'); //특정 key 삭제

        return answer;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
