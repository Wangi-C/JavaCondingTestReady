package algorithm.ResursiveTreeGraph;

public class RecursiveFunction {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * solution(n-1);
        }
    }
}
