package algorithm.ResursiveTreeGraph.review;

public class ShortestNode {

    static Node root;
    static int minLen = Integer.MAX_VALUE;
    public static void main(String[] args) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        DFS(root, 0);
        System.out.println(minLen);
    }

    public static void DFS(Node root, int l) {
        if (root.lt == null && root.rt == null) {
            minLen = Math.min(minLen, l);
        } else {
            DFS(root.lt, ++l);
            l--;
            DFS(root.rt, ++l);
        }
    }
}
