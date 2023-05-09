package algorithm.chepter_string;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int inputInt = in.nextInt();
        String[] intArr = new String[inputInt];

        for (int i = 0; i < inputInt; i++) {
            intArr[i] = in.next();
        }

        solution2(intArr);
    }

    public static void solution(String[] strArr) {

        for (String s : strArr) {
            char[] chars = s.toCharArray();
            char[] charsReverse = new char[chars.length];

            int startIdx = chars.length-1;
            for (int i = startIdx; i > -1; i--) {
                charsReverse[startIdx-i] = chars[i];
            }

            System.out.println(new String(charsReverse));
        }
    }

    public static void solution2(String[] strArr) {
        for (String s : strArr) {
            System.out.println(new StringBuilder(s).reverse());
        }
    }
}
