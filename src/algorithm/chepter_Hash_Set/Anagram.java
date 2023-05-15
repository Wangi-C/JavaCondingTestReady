package algorithm.chepter_Hash_Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(solution(a, b));
    }

    public static String solution(String str1, String str2) {
        String resultAnswer = "NO";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < str1.length(); i++) {
            if (chars1[i] != chars2[i]) {
                resultAnswer = "NO";
                break;
            } else {
                resultAnswer = "YES";
            }
        }

        return resultAnswer;
    }

}
