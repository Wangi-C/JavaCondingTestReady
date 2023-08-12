package algorithm.ResursiveTreeGraph.review;

import java.util.*;

public class RouteSearch {

    static int n, m, answer=0;
    static Map<Integer, List<Integer>> graphMap = new HashMap<>();
    static int[][] graph;
    static int[] ch;

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int start) {
        int[] moveArr = graph[start];
        ch[start] = 1;

        for (int i = 1; i < n+1; i++) {
            if (moveArr[i] == 1 && i == 5) {
                // 방문한 NODE들 출력
                ch[start] = 0;
                answer++;
                return;
            } else if (moveArr[i] == 1 && ch[i] == 0) {
                //다음으로 이동
                DFS(i);
            }
        }

        ch[start] = 0;
    }

    public static void DFSList(int start) {

    }
}
