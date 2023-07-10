package algorithm.chepter_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckDuplication {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(solution2(n, arr));
    }

    public static String solution(int n, int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        IntStream stream = Arrays.stream(arr);
        stream.forEach(a -> set.add(a));

        if (set.size() != arr.length) {
            return "D";
        } else {
            return "U";
        }

    }

    public static String solution2(int n, int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                return "D";
            }
        }

        return "U";
    }
}
