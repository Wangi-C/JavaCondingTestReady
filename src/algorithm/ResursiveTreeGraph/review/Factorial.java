package algorithm.ResursiveTreeGraph.review;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(dfs(11));
    }

    public static int dfs(int a) {

        if (a == 1) {
            return a;
        } else {
            return a * dfs(a-1);
        }
    }
}
