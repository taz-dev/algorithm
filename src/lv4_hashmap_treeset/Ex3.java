package lv4_hashmap_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k-1; rt < n; rt++) {
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
            if (hashMap.get(arr[lt]) == 0) {
                hashMap.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
