package algorithm.chepter_Hash_Set;

import java.util.*;

public class KindOfMoney {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : solution2(n, k, arr)) System.out.print(x+" ");
    }

    public static List<Integer> solution(int n, int k, int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        int idx = 0;
        while (idx+k <= n) {
            for (int i = idx; i < idx+k; i++) {
                set.add(arr[i]);
            }
            result.add(set.size());
            set.clear();
            idx++;
        }

        return result;
    }

    public static List<Integer> solution2(int n, int k, int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        int idx = k;
        while (idx < n) {
            if (set.isEmpty()) {
                for (int i = 0; i < idx; i++) {
                    set.add(arr[i]);
                }
            } else {
                set.remove(arr[idx-k]);
                set.add(arr[idx]);
            }

            result.add(set.size());
            idx++;
        }

        return result;
    }
}
