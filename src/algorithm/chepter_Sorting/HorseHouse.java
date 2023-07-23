package algorithm.chepter_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HorseHouse {
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
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (rt + lt) / 2;
            if (count(mid, arr) >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static int count(int maxLen, int[] arr) {
        int cnt = 1;
        int endPoint = arr[0];
        //maxlen : 두 말의 가장 가까운 거리

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-endPoint >= maxLen) {
                cnt++;
                endPoint = arr[i];
            }
        }

        return cnt;
    }

}
