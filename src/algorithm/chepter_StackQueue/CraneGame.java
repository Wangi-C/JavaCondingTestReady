package algorithm.chepter_StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class CraneGame {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] board=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=kb.nextInt();
            }
        }
        int m=kb.nextInt();
        int[] moves=new int[m];
        for(int i=0; i<m; i++) moves[i]=kb.nextInt();
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int moveCnt = 0;

        while (moveCnt < moves.length) {
            int moveAddress = moves[moveCnt] - 1;
            int doll = 0;
            int y = 0;

            while (y < board.length) {
                int boardDoll1 = board[y][moveAddress];
                int boardDoll2 = board[moveAddress][y];
                if (board[y][moveAddress] > 0) {
                    doll = board[y][moveAddress];
                    board[y][moveAddress] = 0;
                    break;
                }
                y++;
            }

            if (doll == 0) {
                moveCnt++;
                continue;
            } else {
                if (stack.isEmpty()) {
                    stack.push(doll);
                    moveCnt++;
                    continue;
                } else {
                    int topDoll = stack.peek();
                    if (topDoll == doll) {
                        answer++;
                        stack.pop();
                    } else {
                        stack.push(doll);
                    }
                }
            }

            moveCnt++;
        }

        return answer*2;
    }
}
