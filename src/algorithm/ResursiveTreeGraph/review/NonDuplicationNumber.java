package algorithm.ResursiveTreeGraph.review;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicationNumber {

    static int n, m;
    static int[] arr;
    static int[] ch;
    static int[] pm;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        ch=new int[n];
        pm=new int[m];
        DFS(0);
    }

    public static void DFS(int cnt) {
        if (cnt == m) {
            System.out.println(Arrays.toString(pm));
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 1) {
                    continue;
                }
                pm[cnt] = arr[i];
                ch[i] = 1;
                DFS(cnt+1);
                ch[i] = 0;
            }
        }
    }
}
