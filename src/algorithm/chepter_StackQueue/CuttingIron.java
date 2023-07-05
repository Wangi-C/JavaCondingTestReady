package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class CuttingIron {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int answer = 0;
        char preChar = 0;
        Stack<Character> stack = new Stack<>();

        char[] strChars = str.toCharArray();
        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] == '(') {
                stack.push('(');
            } else if (strChars[i] == ')') {
                if (preChar == '(') {
                    //레이저 -> + stack.size
                    answer += stack.size()-1;
                } else if (preChar == ')') {
                    //막대기 끝 -> +1
                    answer += 1;
                }
                stack.pop();
            }
            preChar = strChars[i];
        }
        return answer;
    }
}
