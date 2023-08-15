package algorithm.ResursiveTreeGraph.review;

import java.util.Scanner;

public class Memoezation {

    static int[][] hs;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int r=kb.nextInt();
        hs = new int[n+1][n+1];
        System.out.println(DFS_2(n, r));
    }

    public static int DFS(int n, int r) {
        if (hs[n][r] > 0) {
            return hs[n][r];
        }

        if (r == 0 || n == 0) {
            return 0;
        }
        if (r == 1) {
            hs[n][r] = n;
            return n;
        } else {
            return DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static int DFS_2(int n, int r) {
        if (hs[n][r] > 0) {
            return hs[n][r];
        }

        if (r == 0 || n == r) {
            hs[n][r] = 1;
            return 1;
        } else {
            return DFS_2(n-1, r-1) + DFS_2(n-1, r);
        }
    }
}
