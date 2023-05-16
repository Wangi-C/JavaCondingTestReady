package algorithm.chepter_Hash_Set;

import java.util.HashMap;
import java.util.Scanner;

public class FindingAllOfAna {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(solution2(a, b));
    }

    public static int solution(String a, String b) {
        int resultCnt = 0;
        int perSize = b.length();
        int idx = perSize;
        HashMap<Character, Integer> cntMap = new HashMap<>();
        HashMap<Character, Integer> bStrMap = new HashMap<>();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        //b문자열 부분문자열
        for (char c : charsB) {
            bStrMap.put(c, bStrMap.getOrDefault(c, 0) + 1);
        }

        //a문자열 비교
        for (int i = 0; i < perSize; i++) {
            char c = charsA[i];
            if (bStrMap.containsKey(c)) {
                cntMap.put(charsA[i], cntMap.getOrDefault(charsA[i], 0) + 1);
            }
        }
        if (cntMap.keySet().size() == bStrMap.size()) {
            resultCnt++;
        }

        while (idx < a.length()) {
            char removeChar = charsA[idx-perSize];
            char addChar = charsA[idx];
            if (cntMap.containsKey(removeChar)) {
                cntMap.put(removeChar, cntMap.get(removeChar)-1);
                if (cntMap.get(removeChar) == 0) {
                    cntMap.remove(removeChar);
                }
            }

            if (bStrMap.containsKey(addChar)) {
                cntMap.put(addChar, cntMap.getOrDefault(addChar, 0) + 1);
            }

            if (cntMap.keySet().size() == bStrMap.size()) {
                resultCnt++;
            }

            idx++;
        }

        return resultCnt;
    }

    public static int solution2(String a, String b) {
        int answer=0;
        int lt = 0;
        int rt = b.length()-1;
        HashMap<Character, Integer> am=new HashMap<>();
        HashMap<Character, Integer> bm=new HashMap<>();

        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        //b문자열 부분문자열
        for (char c : charsB) {
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < rt; i++) {
            am.put(charsA[i], am.getOrDefault(charsA[i], 0) + 1);
        }

        while (rt < a.length()) {
            am.put(charsA[rt], am.getOrDefault(charsA[rt], 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(charsA[lt], am.getOrDefault(charsA[lt],0) - 1);
            if (am.get(charsA[lt]) < 1) {
                am.remove(charsA[lt]);
            }
            lt++;
            rt++;
        }

        return answer;
    }
}
