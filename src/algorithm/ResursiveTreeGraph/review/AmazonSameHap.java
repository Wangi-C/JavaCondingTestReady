package algorithm.ResursiveTreeGraph.review;

import java.util.Scanner;

public class AmazonSameHap {

    static String answer="NO";
    static int n, total=0;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            total+=arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }

    public static void DFS(int now, int nowSum, int[] arr) {
        if ("YES".equals(answer)) {
            return;
        }

        if (nowSum > total / 2) {
            return;
        }

        if (now == arr.length) {
            if (nowSum == total - nowSum) {
                answer = "YES";
                return;
            }
        } else {
            int num = arr[now];
            DFS(now+1, nowSum+num, arr);
            DFS(now+1, nowSum, arr);
        }
    }
}
