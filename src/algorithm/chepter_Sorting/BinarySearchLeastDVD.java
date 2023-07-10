package algorithm.chepter_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchLeastDVD {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt(); // Stream.max ->  java.util.OptionalInt
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (valid(arr, mid) <= m) {
                //2장에 넣을 수 있다면 3장도 가능한다.
                answer = mid;
                rt = mid-1;
            } else {
                //3장에 못 담으면 lt를 늘려준다.
                lt = mid+1;
            }
        }

        return answer;
    }

    public static int valid(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;

        for (int i : arr) {
            if (sum+i > capacity) {
                cnt++;
                sum=i;
            } else {
                sum+=i;
            }
        }

        return cnt;
    }
}
