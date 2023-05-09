package algorithm.chepter_string;

import java.util.Scanner;

public class ReverseSpecialWord {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(solution(input1));
    }

    public static String solution(String str) {
        char[] chars = str.toCharArray();
        char[] resultChars = new char[str.length()];
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                resultChars[rt] = chars[lt];
                resultChars[lt] = chars[rt];
                lt++;
                rt--;
            }
        }

        return new String(resultChars);
    }
}
