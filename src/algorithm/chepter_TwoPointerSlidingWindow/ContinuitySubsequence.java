package algorithm.chepter_TwoPointerSlidingWindow;

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
        System.out.print(solution2(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = arr[rt];

        while (rt < n) {
            //1. sum 값이 m 보다 작으면 rt++
            //2. sum 값이 m 보다 크거나 같으면 lt++
            if (sum < m) {
                rt++;
            } else if (sum > m) {
                sum -= arr[lt];
                lt++;
            } else if (sum == m) {
                answer++;
                sum -= arr[lt];
                lt++;
            }

            //sum구하기
            sum = 0;
            for (int i = lt; i < rt+1; i++) {
                sum += arr[i];
            }
        }

        return answer;
    }

    public static int solution2(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for (int rt=0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum==m) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
