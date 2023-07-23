package algorithm.ResursiveTreeGraph;

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
        DFS(root);
    }

    public static void DFS(Node tree) {
        if (tree.lt == null) {
            System.out.print(tree.num + " ");
            return;
        } else {
            DFS(tree.lt);
            System.out.print(tree.num + " ");
        }

        if (tree.rt == null) {
            return;
        } else {
            DFS(tree.rt);
        }
    }
}

class Node {
    int num;
    Node lt, rt;
    public Node(int n) {
        this.num = n;
    }
}
