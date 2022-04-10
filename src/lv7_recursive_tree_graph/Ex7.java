package lv7_recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Ex7 {
    Node root;
    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(level + " : ");

            for (int i = 0; i < len; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.lt != null) queue.add(current.lt);
                if (current.rt != null) queue.add(current.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ex7 tree = new Ex7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
