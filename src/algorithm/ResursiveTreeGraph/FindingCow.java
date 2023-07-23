package algorithm.ResursiveTreeGraph;

import java.util.*;

public class FindingCow {
    public static Queue<Integer> queue;
    public static Map<Integer, Integer> moveHistory;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int e=kb.nextInt();
        System.out.println(BFS(s, e));
    }

    public static String BFS(int s, int e) {
        int[] canMoveLen = {1, -1, 5};
        int L = 0;
        queue = new LinkedList<>();
        moveHistory = new HashMap<>();
        queue.offer(s);
        while(!queue.isEmpty()) {
            int qSize = queue.size();
//            System.out.println("L = " + L);
            for (int i = 0; i < qSize; i++) {
                int canMove = queue.poll();
//                System.out.println("canMove = " + canMove);
                if (canMove == e) {
                    return L+"";
                } else {
                    for (int c : canMoveLen) {
                        int move = canMove + c;
                        if (!moveHistory.containsKey(move)) {
                            moveHistory.put(move, move);
                            queue.offer(canMove + c);
                        }
                    }
                }
            }
            L++;
        }
        return L+"";
    }
}
