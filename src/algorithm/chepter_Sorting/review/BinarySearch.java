package algorithm.chepter_Sorting.review;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
//        test();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = n-1;

        Arrays.sort(arr);

        while (lt < rt) {
            int mid = (lt + rt) / 2;
            int now = arr[mid];

            if (now > m) {
                rt = mid -1;
            } else if (now < m) {
                lt = mid + 1;
            } else {
                answer = mid;
                break;
            }

            if (lt == rt) {
                answer = lt;
            }
        }

        return answer+1;
    }
}
