package algorithm.chepter_Hash_Set;

import java.util.*;

public class KthLargestNum {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }

    public static int solution(int[] arr, int n, int k) {
        Set<Integer> hapSet = new HashSet<>();
        int answer = -1;
        int lt = 0;
        int rt = lt+2;

        int[] sortedDesc = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        while (lt < n-2) {
            int sum = 0;

            for (int i = lt; i < 2; i++) {
                sum += sortedDesc[i];
            }

            while (rt < n) {
                sum+=sortedDesc[rt];
                hapSet.add(sum);

                if (hapSet.size() == k) {
                    return sum;
                }

                sum-=sortedDesc[rt];
                rt++;
            }
            lt++;
            rt = lt+2;
        }


        return answer;
    }
}
