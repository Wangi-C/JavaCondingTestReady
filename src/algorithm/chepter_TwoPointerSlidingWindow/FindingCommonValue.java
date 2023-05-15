package algorithm.chepter_TwoPointerSlidingWindow;

import java.lang.reflect.Array;
import java.util.*;

public class FindingCommonValue {

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
//        for(int x : solution(a, b)) System.out.print(x+" ");
        for(int x : solution2(n, m, a, b)) System.out.print(x+" ");
    }

    public static List<Integer> solution(int[] a1Arr, int[] a2Arr) {
        List<Integer> resultList = new ArrayList<>();
        Map<Integer,Integer> history = new HashMap<>();

        List<int[]> list = new ArrayList<>();
        list.add(a1Arr);
        list.add(a2Arr);

        for (int[] arr : list) {
            for (int i : arr) {
                if (history.containsKey(i) && history.get(i)==1) {
                    resultList.add(i);
                }
                history.put(i, history.getOrDefault(i,0)+1);
            }
        }

        Collections.sort(resultList);

        return resultList;
    }

    public static List<Integer> solution2(int a1, int a2, int[] a1Arr, int[] a2Arr) {
        List<Integer> resultList = new ArrayList<>();

        Arrays.sort(a1Arr);
        Arrays.sort(a2Arr);
        int idx1 = 0, idx2 = 0; // 이 부분을 생각하지 못했다..
        while (idx1 < a1 && idx2 < a2) {
            if (a1Arr[idx1] == a2Arr[idx2]) {
                resultList.add(a1Arr[idx1]);
                idx1++;
                idx2++;
            } else {
                if (a1Arr[idx1] > a2Arr[idx2]) {
                    idx2++;
                } else {
                    idx1++;
                }
            }
        }

        return resultList;
    }
}
