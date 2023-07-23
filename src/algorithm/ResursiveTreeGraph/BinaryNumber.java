package algorithm.ResursiveTreeGraph;

import java.util.Stack;

public class BinaryNumber {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack = solution(100, stack);
        int stackSize = stack.size();
        String answer = "";
        for (int i = 0; i < stackSize; i++) {
            answer += stack.pop();
        }

        System.out.println("answer = " + answer);
    }

    public static Stack<Integer> solution(int n, Stack<Integer> stack) {
        if (n == 0) {
            return stack;
        } else {
            stack.push(n%2);
            return solution((int)n/2, stack);
        }
    }
}
