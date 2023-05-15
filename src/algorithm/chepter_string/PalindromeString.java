package algorithm.chepter_string;

import java.util.Scanner;

public class PalindromeString {
    /**
     * 희문 문자열 : 앞뒤 거꾸로해도 같은 문자열
     * */
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {

        //1. 대소문자를 구분하지 않는다.
        String targetStr = str.toLowerCase();
        String reverseStr = new StringBuilder(targetStr).reverse().toString();

        return (targetStr.equals(reverseStr)) ? "YES" : "NO";
    }
}
