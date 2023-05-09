package algorithm.chepter_string;

import java.util.Scanner;

public class ConvertingStrCase {
    /**
     * 대소문자 변환 : https://cote.inflearn.com/contest/10/problem/01-02
     * */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solutionAnswer(input1));
    }

    public static String solution(String str) {
        char[] resultChar = new char[str.length()];
        char[] strChar = str.toCharArray();
        char[] lowerCaseStr = str.toLowerCase().toCharArray();
        char[] upperCaseStr = str.toUpperCase().toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (strChar[i] != lowerCaseStr[i]) {
                resultChar[i] = lowerCaseStr[i];
                continue;
            } else if (strChar[i] != upperCaseStr[i]) {
                resultChar[i] = upperCaseStr[i];
                continue;
            } else {
                System.out.println("뭔가 잘못됌");
            }
        }

        return new String(resultChar);
    }

    public static String solutionAnswer(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }
}
