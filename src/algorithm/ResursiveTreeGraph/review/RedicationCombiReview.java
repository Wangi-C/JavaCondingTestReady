package algorithm.ResursiveTreeGraph.review;

import java.util.Arrays;
import java.util.Scanner;

public class RedicationCombiReview {
    static int n, f;
    static int[] b;
    static int[] p;
    static int[] ch;
    static boolean flag;

    static int[][] dy = new int[35][35];


    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        f=kb.nextInt();
        b=new int[n];
        p=new int[n];
        ch=new int[n+1];
        for(int i=0; i<n; i++){
            b[i]=combi(n-1, i);
        }
        DFS(0, 0);
    }

    public static int combi(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }

    public static void DFS(int now, int sum) {
        if (flag) {
            return;
        }

        if (now == n) {
            if (sum == f) {
                for (int i : p) {
                    System.out.print(i + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <=n; i++) {
                if (ch[i] == 0) {
                    p[now] = i;
                    ch[i] = 1;
                    DFS(now+1, sum+(b[now]*p[now]));
                    ch[i] = 0;
                }
            }
        }
    }
}
