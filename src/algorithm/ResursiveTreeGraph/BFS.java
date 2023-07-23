package algorithm.ResursiveTreeGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    static Node root;
    static Queue<Node> queue;

    public static void main(String[] args) {
        queue = new LinkedList<>();
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        BFS(root);
    }

    public static void BFS(Node tree) {
        List<Integer> list = new ArrayList<>();
        int L = 0;
        queue.offer(tree);
        while(!queue.isEmpty()) {
            int qSize = queue.size();
            System.out.println("L = " + L);
            for (int i = 0; i < qSize; i++) {
                Node node = queue.poll();
                System.out.println("node.num = " + node.num);
//                list.add(node.num);
                if (node.lt != null && node.rt != null) {
                    queue.offer(node.lt);
                    queue.offer(node.rt);
                }
            }
            L++;
        }
    }
}
