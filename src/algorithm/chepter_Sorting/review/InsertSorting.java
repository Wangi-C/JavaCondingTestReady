package algorithm.chepter_Sorting.review;

import java.util.Scanner;

public class InsertSorting {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solution(n, arr)) System.out.print(x+" ");
    }

    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n-1; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return  arr;
    }
}
