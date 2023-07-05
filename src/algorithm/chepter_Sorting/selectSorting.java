package algorithm.chepter_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectSorting {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solution(n, arr)) System.out.print(x+" ");
    }

    public static int[] solution(int n, int[] arr) {
        Arrays.sort(arr);

        return arr;
    }
}
