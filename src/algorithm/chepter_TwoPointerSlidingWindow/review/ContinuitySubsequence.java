package algorithm.chepter_TwoPointerSlidingWindow.review;

import java.util.Scanner;

public class ContinuitySubsequence {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = arr[rt];

        while (rt < n) {
            if (sum < m) {
                sum += arr[rt];
            }

            while (sum >= m) {
                if (sum == m) {
                    answer++;
                }
                sum -= arr[lt++];
            }
        }

        return answer;
    }
}
