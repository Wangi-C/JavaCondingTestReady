package algorithm.ResursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLastNodeLen {
    public static Node root;
    public static int minValue = Integer.MAX_VALUE;
    public static void main(String args[]) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
//        DFS(0, root);
        System.out.println(BFS(0, root));
    }

    public static void DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            minValue = Math.min(minValue, L);
        } else {
            L++;
            DFS(L, root.lt);
            DFS(L, root.rt);
        }
    }

    public static int BFS(int L, Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for (int i = 0; i < qSize; i++) {
                Node r = queue.poll();
                if (r.lt == null && r.rt == null) {
                    return L;
                } else {
                    queue.offer(r.lt);
                    queue.offer(r.rt);
                }
            }
            L++;
        }

        return L;
    }
}
