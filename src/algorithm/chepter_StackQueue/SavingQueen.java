package algorithm.chepter_StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingQueen {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }
}
