package lv7_recursive_tree_graph;

public class Ex4 {
    static int[] fibo;
    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n]; //메모이제이션 활용해서 시간복잡도 줄임
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        int n = 45;
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
