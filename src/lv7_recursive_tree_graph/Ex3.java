package lv7_recursive_tree_graph;

public class Ex3 {
    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n-1);
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        System.out.println(T.DFS(5));
    }
}
