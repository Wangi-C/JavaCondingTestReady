package algorithm.ResursiveTreeGraph.review;

import java.util.HashMap;
import java.util.Map;

public class Fibo {

    private static Map<Integer, Integer> map = new HashMap<>();
    private static int[] fiboArr = new int[46];

    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            map.put(i, fibo(i));
            System.out.println(fibo(i));
        }

        for (int i = 1; i <= 45; i++) {
            System.out.println(fibo2(i));
        }
    }

    public static int fibo(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return map.get(i-1) + map.get(i-2);
        }
    }

    public static int fibo2(int i) {
        if (fiboArr[i] > 0) {
            return fiboArr[i];
        }

        if (i == 1 || i == 2) {
            fiboArr[i] = 1;
            return fiboArr[i];
        } else {
            fiboArr[i] = fibo2(i-1) + fibo2(i-2);
            return fiboArr[i];
        }
    }
}
