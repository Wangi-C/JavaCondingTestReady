package algorithm.ResursiveTreeGraph.review;

import java.util.LinkedList;
import java.util.Queue;

public class BFSMain {

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
        BFS_1(root);
    }

    public static void BFS(Node root) {
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node pollNode = queue.poll();
            System.out.print(pollNode.num + " ");

            if (pollNode.lt != null) {
                queue.offer(pollNode.lt);
            }
            if (pollNode.rt != null) {
                queue.offer(pollNode.rt);
            }
        }
    }

    public static void BFS_1(Node root) {
        int L = 0;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int queueSize = queue.size();

            System.out.print(L + " : ");
            for (int i = 0; i < queueSize; i++) {
                Node pollNode = queue.poll();
                System.out.print(pollNode.num + " ");

                if (pollNode.lt != null) {
                    queue.offer(pollNode.lt);
                }
                if (pollNode.rt != null) {
                    queue.offer(pollNode.rt);
                }
            }

            System.out.println();
            L++;

        }
    }
}
