package algorithm.ResursiveTreeGraph.review;

import java.util.Scanner;

public class MiroSearch {

    static int[][] board;
    static int answer;

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        DFS(1, 1);
        System.out.print(answer);
    }

    public static void DFS(int x, int y) {
        if (x == 0 || y == 0) {
            return;
        } else if (x == board.length || y == board.length) {
            return;
        } else if (x == (board.length-1) && y == (board.length-1)) {
            answer++;
            return;
        } else {
            if (board[x][y] != 1) {
                board[x][y] = 1;
                DFS(x-1, y);
                DFS(x+1, y);
                DFS(x, y-1);
                DFS(x, y+1);
                board[x][y] = 0;
            }
        }
    }
}
