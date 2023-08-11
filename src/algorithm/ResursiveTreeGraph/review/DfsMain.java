package algorithm.ResursiveTreeGraph.review;

public class DfsMain {
    public static void main(String[] args) {
        dfs(5);
    }

    public static void dfs(int i) {
        if (i == 0) {
            System.out.println("i = " + i);
        } else {
            dfs(i-1);
            System.out.println("i = " + i);
        }
    }
}
