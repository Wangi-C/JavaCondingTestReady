package algorithm.ResursiveTreeGraph.review;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RouteSearchList {

    static int n,m, answer;
    static Map<Integer, ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph = new HashMap<>();
        for(int i=0; i<=n; i++){
            graph.put(i+1, new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1]=1;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int start) {
        ArrayList<Integer> moveList = graph.get(start);

        for (int move : moveList) {
            if (move == 5) {
                answer++;
                return;
            } else if (ch[move] != 1) {
                ch[start] = 1;
                DFS(move);
                ch[start] = 0;
            }
        }
    }
}
