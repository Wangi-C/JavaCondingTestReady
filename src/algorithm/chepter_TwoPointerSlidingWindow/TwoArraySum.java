package algorithm.chepter_TwoPointerSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraySum {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }

        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : solution(n, m, a, b)) System.out.print(x+" ");
    }

    public static int[] solution(int a1, int a2, int[] a1Arr, int[] a2Arr) {
        int[] resultArr = new int[a1+a2];
        int insertCnt = 0;

        for (int a : a1Arr) {
            resultArr[insertCnt] = a;
            insertCnt++;
        }

        for (int b : a2Arr) {
            resultArr[insertCnt] = b;
            insertCnt++;
        }

        Arrays.sort(resultArr);
        return resultArr;
    }
}
