package algorithm.ResursiveTreeGraph.review;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestNodeBFS {

    static Node root;
    static Queue<Node> queue = new LinkedList<>();
    public static void main(String[] args) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        root.lt.lt.lt=new Node(8);
        root.lt.lt.rt=new Node(9);


        System.out.println(BFS(root));
    }

    public static int BFS(Node root) {
        int L = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int qSize = queue.size();

            for (int i = 0; i < qSize; i++) {
                Node node = queue.poll();

                if (node.lt == null && node.rt == null) {
                    System.out.println("node.num = " + node.num);
                    return L;
                } else {
                    queue.offer(node.lt);
                    queue.offer(node.rt);
                }
            }

            L++;
        }

        return L;
    }
}
