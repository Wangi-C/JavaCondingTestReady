package algorithm.chepter_Array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMaxNum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(arr);
    }

    public static void solution(int[] arr) {
        int preNum = 0;

        for (int i : arr) {
            if (preNum < i) {
                System.out.print(i + " ");
            }
            preNum = i;
        }
    }
}
