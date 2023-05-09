package algorithm.chepter_string;

import java.util.Scanner;

public class FindingWord {
    /**
     * 문자 찾기 : https://cote.inflearn.com/contest/10/problem/01-01
     * */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }

    public static int solution(String str, String targetStr) {
        int cnt = 0;
        char[] strCharArr = str.toLowerCase().toCharArray();
        char[] strTargetChar = targetStr.toLowerCase().toCharArray();

        for (char c : strCharArr) {
            if (c == strTargetChar[0]) {
                cnt++;
            }
        }
        return cnt;
    }
}
