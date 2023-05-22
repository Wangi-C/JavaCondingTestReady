package algorithm.chepter_TwoPointerSlidingWindow;

import java.util.Scanner;

public class SumOfContinuityNumber {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int lt = 1;
        int rt = 1;
        int sum = 0;

        while(rt < (n - rt) || rt - (n-rt) < 2) {
            sum += rt;
            rt++;
            if (sum == n) {
                answer++;
            }
            while (sum > n) {
                sum -= lt;
                if (sum == n) {
                    answer++;
                }
                lt++;
            }
        }

        return answer;
    }
}
