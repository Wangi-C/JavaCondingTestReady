package algorithm.ResursiveTreeGraph.review;

import java.util.Scanner;

public class Badugi {

    static int c, n, answer;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }

    public static void DFS(int n, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (n == arr.length) {
            answer = Math.max(answer, sum);
            return;
        } else {
            DFS(n+1, sum+arr[n], arr);
            DFS(n+1, sum, arr);
        }
    }
}
