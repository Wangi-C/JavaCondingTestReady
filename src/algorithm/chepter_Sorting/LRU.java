package algorithm.chepter_Sorting;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class LRU {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int s=kb.nextInt();
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for (int a : solution(s, n, arr)) {
            System.out.print(a + " ");
        }

    }

    public static int[] solution(int s, int n, int[] arr) {

        int[] answer = new int[s];
        Queue<Integer> queue = new LinkedList<>();

        for (int i : arr) {
            if (queue.size() < s) {
                queue.remove(i);
            } else if (queue.size() == s) {
                if (queue.contains(i)) {
                    queue.remove(i);
                } else {
                    queue.poll();
                }
            }

            queue.add(i);
        }

        for (int i = s-1; i >=0; i--) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void test() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(5);
        queue.add(3);

        queue.remove(5);

        System.out.println(queue.size());

        queue.add(5);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
