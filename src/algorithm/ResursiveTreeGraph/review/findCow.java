package algorithm.ResursiveTreeGraph.review;

import java.util.*;

public class findCow {

    static Queue<Integer> queue = new LinkedList<>();
    static Map<Integer, Integer> history = new HashMap<>();
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(BFS(s, e));
    }

    public static int BFS(int s, int e) {
        int L = 1;
        int[] move = {1, -1, 5};

        queue.offer(s);
        while (!queue.isEmpty()) {
            int qSize = queue.size();

            for (int i = 0; i < qSize; i++) {
                int now = queue.poll();

                for (int m : move) {
                    if ((now+m) == e) {
                        return L;
                    } else {
                        int nextInt = now+m;
                        if (history.containsKey(nextInt)) {
                            continue;
                        } else {
                            history.put(nextInt, nextInt);
                            queue.offer(nextInt);
                        }
                    }
                }
            }

            L++;
        }

        return L;
    }

}
