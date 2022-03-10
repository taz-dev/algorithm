package lv7_recursive_tree_graph;

public class Ex2 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        T.DFS(11);
    }
}
