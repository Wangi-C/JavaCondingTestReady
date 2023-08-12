package algorithm.ResursiveTreeGraph.review;

import java.util.*;

public class GraphShortestRoute {

    static int n,m, answer;
    static Map<Integer, ArrayList<Integer>> graph;
    static Queue<Integer> queue = new LinkedList<>();
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
        BFS(1);
        System.out.println(answer);
    }

    public static void BFS(int start) {
        int L = 0;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int qSize = queue.size();

            System.out.print(L + "번 이동 : ");
            for (int i = 0; i < qSize; i++) {
                int now = queue.poll();
                System.out.print(now + ", ");
                ArrayList<Integer> move = graph.get(now);
                for (int m : move) {
                    if (ch[m] != 1) {
                        ch[m] = 1;
                        queue.offer(m);
                    }
                }
            }
            System.out.println();

            L++;
        }
    }
}
