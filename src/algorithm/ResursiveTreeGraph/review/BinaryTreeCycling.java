package algorithm.ResursiveTreeGraph.review;

public class BinaryTreeCycling {
    static Node root;

    public static void main(String[] args) {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        DFS_1(root);
    }

    public static void DFS_1(Node tree) {
        if (tree.lt == null) {
            System.out.print(tree.num + " ");
            return;
        } else {
            DFS_1(tree.lt);
            DFS_1(tree.rt);
            System.out.print(tree.num + " ");
        }
    }
}
