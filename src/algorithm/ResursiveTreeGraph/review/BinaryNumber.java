package algorithm.ResursiveTreeGraph.review;

public class BinaryNumber {
    public static void main(String[] args) {
        dfs(11);
    }

    public static void dfs(int a) {
        if ((a / 2) == 0) {
            System.out.print((a % 2) + " ");
        } else {
            dfs(a / 2);
            System.out.print((a % 2) + " ");
        }
    }
}
