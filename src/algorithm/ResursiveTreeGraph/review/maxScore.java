package algorithm.ResursiveTreeGraph.review;

import java.util.Scanner;

public class maxScore {

    static int n, m, answer;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
            b[i]=kb.nextInt();
        }
        DFS_2(0, 0, 0, a, b);
        System.out.println(answer);
    }

    public static void DFS(int now, int totalScore, int totalTime, int[] a, int[] b) {

        if (now == n) {
            answer = Math.max(answer, totalScore);
            return;
        } else {
            int score = a[now];
            int time = b[now];

            if (m < totalTime+time) {
                answer = Math.max(answer, totalScore);
                return;
            } else {
                DFS(now+1, totalScore+score, totalTime+time, a, b);
                DFS(now+1, totalScore, totalTime, a, b);
            }
        }
    }

    public static void DFS_2(int now, int totalScore, int totalTime, int[] a, int[] b) {

        if (m < totalTime) {
            return;
        }

        if (now == n) {
            answer = Math.max(answer, totalScore);
        } else {
            int score = a[now];
            int time = b[now];

            DFS_2(now+1, totalScore+score, totalTime+time, a, b);
            DFS_2(now+1, totalScore, totalTime, a, b);
        }
    }
}
