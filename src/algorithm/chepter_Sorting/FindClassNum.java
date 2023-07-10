package algorithm.chepter_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindClassNum {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : solution(n, arr)) System.out.print(x+" ");
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] newArr = arr.clone();
        Arrays.sort(newArr);

        for (int i = 0; i < n; i++) {
            int arrNum = arr[i];
            int copyNum = newArr[i];
            if (copyNum != arrNum) {
                list.add(i+1);
            }

            if (list.size() == 2) {
                break;
            }
        }

        return list;
    }
}
