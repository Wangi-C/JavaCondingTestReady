package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class CuttingFrame {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] strChars = str.toCharArray();
        char preChar = 0;

        for (char c : strChars) {
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                stack.pop();
                if (preChar == '(') {
                    //자르기
                    answer += stack.size();
                } else {
                    //막대기 끝
                    answer += 1;
                }
            }
            preChar = c;
        }

        return answer;
    }
}
