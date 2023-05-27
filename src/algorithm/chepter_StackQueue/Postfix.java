package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }

    public static int solution(String str){
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (x) {
                    case '+':
                        stack.push(lt+rt);
                        break;
                    case '-':
                        stack.push(lt-rt);
                        break;
                    case '*':
                        stack.push(lt*rt);
                        break;
                    case '/':
                        stack.push(lt/rt);
                        break;
                }
            }
        }

        return stack.get(0);
    }
}
