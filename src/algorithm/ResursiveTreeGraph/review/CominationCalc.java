package algorithm.ResursiveTreeGraph.review;

import java.util.Arrays;
import java.util.Scanner;

public class CominationCalc {

    static int n, m;
    static int[] combi;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        combi=new int[m];
        DFS(0, 1);
    }

    public static void DFS(int L, int num) {

        if (L == m) {
            System.out.println(Arrays.toString(combi));
        } else {
            for (int i = num; i <= n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
}
