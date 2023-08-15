package algorithm.ResursiveTreeGraph.review;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicationNumber {

    static int n, m;
    static int[] pm;

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        DFS(0);
    }

    public static void DFS(int cnt) {
        for (int i = 1; i < n+1; i++) {
            if (cnt == m) {
                System.out.println("pm = " + Arrays.toString(pm));
                return;
            } else {
                pm[cnt] = i;
                DFS(cnt+1);
            }
        }
    }
}
