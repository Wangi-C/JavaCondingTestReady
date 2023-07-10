package algorithm.chepter_Sorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class BinarySearch {
    public static void main(String[] args){
//        test();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 1;
        /*
        * TreeSet은 기본족으로 오름차순을 지원
        * 내림차순 : new TreeSet<>(Collections.reverseOrder())
        * */
        TreeSet<Integer> set = new TreeSet<>();
        for (int a : arr) {
            set.add(a);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int iter = iterator.next();

            if (iter == m) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void test() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(10);
        set.add(12);
        set.add(6);
        set.add(45);
        set.add(3);

        System.out.println(set);
    }
}
