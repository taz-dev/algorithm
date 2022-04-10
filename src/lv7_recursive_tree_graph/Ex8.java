package lv7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex8 {
    int level = 0;
    int[] dis = {1, -1, 5};
    int[] check;
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int start, int end) {
        check = new int[10001];
        check[start] = 1;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == end) return level + 1;
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Ex8 T = new Ex8();
        Scanner kb = new Scanner(System.in);
        int start = kb.nextInt();
        int end = kb.nextInt();
        System.out.println(T.BFS(start, end));
    }
}
