package algorithm.chepter_TwoPointerSlidingWindow;

import java.util.Scanner;

public class MaxContinuitySubsequence {
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
        int answer = 0;
        int len = 0;
        int lt = 0;
        int rt = 0;

        while (rt < n) {
            if (arr[rt] == 0) {
                if (k>0) {
                    k--;
                } else {
                    while (k==0) {
                        if (arr[lt] == 0) {
                            k++;
                        }
                        lt++;
                    }
                }
            }
            len = rt - lt + 1;
            answer = Math.max(answer, len);

            rt++;
        }

        return answer;
    }
}
