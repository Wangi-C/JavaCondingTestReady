package algorithm.chepter_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectSorting {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solutionSort(n, arr)) System.out.print(x+" ");
    }

    public static int[] solution(int n, int[] arr) {
        Arrays.sort(arr);

        return arr;
    }

    public static int[] solutionSort(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;

            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }
}
