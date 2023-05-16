package algorithm.chepter_TwoPointerSlidingWindow;

import java.util.Scanner;

public class MaxSelling {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(n, k, arr));
    }

    public static int solution(int n, int k, int[] arr) {
        int idx = k;
        int max = 0;
        int sum = 0;
        boolean isFirst = true;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = Math.max(max, sum);
        while(idx < n) {
            sum -= arr[idx-k];
            sum += arr[idx];
            max = Math.max(max, sum);
            idx++;
        }

        return max;
    }
}
