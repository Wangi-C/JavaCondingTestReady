package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemovingWordsInBracket {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str).trim());
    }

    public static String solution(String str) {
        char[] strChars = str.toCharArray();
        char[] answerChars = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        int i = 0;

        for (char c :strChars) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    answerChars[i++] = c;
                }
            }
        }

        return new String(answerChars);
    }
}
