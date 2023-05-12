package algorithm.chepter_string;

import java.util.*;

public class DuplicatingChar {
    /**
     * input : ksekkset
     * */
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        List<Character> history = new ArrayList<>();
        char[] strChars = str.toCharArray();
        char[] result = new char[str.length()];
        char beforeChar = 0;
        int resultIdx = 0;

        for (char c : strChars) {
            if (!history.contains(c)) {
                result[resultIdx] = c;
                history.add(c);
                resultIdx++;
            }
        }

        return new String(result).trim();
    }
}
