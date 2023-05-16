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
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int idx = k;

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.keySet().size());

        while (idx < n) {
            if (map.containsKey(arr[idx-k])) {
                int cnt = map.get(arr[idx-k]) - 1;
                if (cnt == 0) {
                    map.remove(arr[idx-k]);
                } else {
                    map.put(arr[idx-k], map.get(arr[idx-k]) - 1);
                }
            }
            map.put(arr[idx], map.getOrDefault(arr[idx], 0) + 1);
            result.add(map.keySet().size());
            idx++;
        }

        return result;
    }
}
