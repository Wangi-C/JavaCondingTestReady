package algorithm.ResursiveTreeGraph;

public class Fibo {
    static int[] fibo1;
    static int[] fibo2;
    public static void main(String[] args) {
        int n = 20;
        fibo1 = new int[n];
        fibo2 = new int[n];

        solution(0);

        System.out.println("solu-1_answer : " + fibo1[n-1]);
//        System.out.println(solution2(n));
    }

    public static int solution(int n) {
        if (n == fibo1.length) {
            return 0;
        } else if (n == 0) {
            fibo1[n] = 1;
            return solution(n+1);
        } else if (n == 1) {
            fibo1[n] = 1;
            return solution(n+1);
        } else {
            fibo1[n] = fibo1[n-1] + fibo1[n-2];
            return solution(n+1);
        }
    }

    public static int solution2(int n) {
        if (n==0) return 1;
        else if (n==1) return 1;
        else return solution2(n-2) + solution2(n-1);
    }
}
