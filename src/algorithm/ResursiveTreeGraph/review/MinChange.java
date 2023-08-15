package algorithm.ResursiveTreeGraph.review;

import java.util.*;

public class MinChange {

    static int n, m, answer;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m=kb.nextInt();
        BFS(arr);
        System.out.println(answer);
    }

    public static void BFS(Integer[] arr) {
        int L = 1;
        queue.offer(arr[0]);

        while (!queue.isEmpty()) {
            int qSize = queue.size();
            L++;
            for (int i = 0; i < qSize; i++) {
                int now = queue.poll();
                for (int j = 0; j < arr.length; j++) {
                    int sum = now+arr[j];
                    if (sum == m) {
                        answer = L;
                        return;
                    } else {
                        queue.offer(sum);
                    }
                }
            }
        }
    }
}
