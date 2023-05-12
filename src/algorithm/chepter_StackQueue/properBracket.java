package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class properBracket {
    /**
     * input : (()(()))(()
     * */

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        char[] strChars = str.toCharArray();
        Stack<Character> bracketStack = new Stack<>();

        for (char c : strChars) {
            if (c == '(') {
                bracketStack.push(c);
            } else if (c == ')') {
                if (bracketStack.isEmpty()) {
                    return "NO";
                } else {
                    bracketStack.pop();
                }
            }
        }

        return bracketStack.isEmpty()?"YES":"NO";
    }
}
