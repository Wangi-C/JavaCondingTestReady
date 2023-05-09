package algorithm.chepter_string;

import java.util.Scanner;

public class WordInString {
    /**
     * 대소문자 변환 : https://cote.inflearn.com/contest/10/problem/01-02
     * */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }

    public static String solution(String str) {
        String result = "";
        String[] strSplit = str.trim().split(" ");
        int maxLen = 0;

        for (String s : strSplit) {
            if (maxLen < s.length()) {
                result = s;
                maxLen = s.length();
            }
        }

        return result;
    }
}
