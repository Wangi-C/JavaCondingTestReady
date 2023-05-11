package algorithm.chepter_Array;

import java.util.Scanner;

public class SeenStudent {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(solution(arr));
    }

    public static int solution(int[] arr) {
        int resultCnt = 0;
        int max = 0;
        int beforeMax = max;

        for (int i : arr) {
            max = Math.max(max, i);
            if (beforeMax != max) {
                resultCnt++;
                beforeMax = max;
            }
        }

        return resultCnt;
    }
}
