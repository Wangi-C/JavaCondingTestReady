package algorithm.chepter_string.review;

import java.util.Scanner;

public class ReverseSpecialWord {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(solution(input1));
    }

    public static String solution(String str) {
        /**
         * input : a#b!GE*T@S
         * output : S#T!EG*b@a
         * */
        int startIdx = 0;
        int endIdx = str.length() - 1;

        char[] resultChars = new char[str.length()];

        while (startIdx < endIdx) {
            if (!Character.isAlphabetic(str.charAt(startIdx))) {
                resultChars[startIdx] = str.charAt(startIdx);
                startIdx++;
            } else if (!Character.isAlphabetic(str.charAt(endIdx))) {
                resultChars[endIdx] = str.charAt(endIdx);
                endIdx--;
            } else {
                resultChars[endIdx] = str.charAt(startIdx);
                resultChars[startIdx] = str.charAt(endIdx);
                startIdx++;
                endIdx--;
            }
        }

        return new String(resultChars);
    }
}
