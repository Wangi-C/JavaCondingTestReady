package algorithm.chepter_Hash_Set.review;

import java.util.HashMap;
import java.util.Scanner;

public class FindingAllOfAna {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(solution(a, b));
    }

    public static int solution(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        int k = charsB.length-1;
        int answer = 0;

        for (char c : charsB) {
            mapA.put(c, mapA.getOrDefault(c,0) + 1);
        }

        for (int i = 0; i < k; i++) {
            mapB.put(charsA[i], mapB.getOrDefault(charsA[i], 0) + 1);
        }

        for (int i = k; i < charsA.length; i++) {
            mapB.put(charsA[i], mapB.getOrDefault(charsA[i], 0) + 1);
            if (mapA.equals(mapB)) {
                answer++;
            }
            char removeC = charsA[i-k];
            mapB.put(removeC, mapB.get(removeC)-1);
            if (mapB.get(removeC) == 0) {
                mapB.remove(removeC);
            }
        }

        return answer;
    }
}
