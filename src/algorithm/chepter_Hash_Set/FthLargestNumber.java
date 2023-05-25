package algorithm.chepter_Hash_Set;

import java.util.*;

public class FthLargestNumber {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(solution2(arr, n, k));
    }

    public static int solution(int[] arr, int n, int k) {
        Set<Integer> hapSet = new HashSet<>();
        int answer = -1;
        int sum = 0;
        int lt = 0;
        int mt = lt+1;
        int rt = lt+2;

        int[] sortedDesc = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();


        while (lt < n-2) {

            sum += sortedDesc[lt];

            while (mt < n-1) {
                sum += sortedDesc[mt];

                while (rt < n) {
                    sum += sortedDesc[rt];
                    hapSet.add(sum);

                    if (hapSet.size() == k) {
                        return sum;
                    }

                    sum-=sortedDesc[rt];
                    rt++;
                }

                sum-=sortedDesc[mt];
                mt++;
            }

            sum-=sortedDesc[lt];
            lt++;
        }


        return answer;
    }

    public static int solution2(int[] arr, int n, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j< n; j++) {
                for (int x = j+1; x < n; x++) {
                    treeSet.add(arr[i] + arr[j] + arr[x]);
                }
            }
        }

        int i = 0;
        for (int num : treeSet) {
            i++;
            if (i == k) {
                return num;
            }
        }

        return answer;
    }
}
