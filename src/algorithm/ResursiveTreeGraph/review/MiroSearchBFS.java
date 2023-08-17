package algorithm.ResursiveTreeGraph.review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MiroSearchBFS {
    static int[][] board;
    static int answer;
    static Queue<MoveXY> queue = new LinkedList<>();

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=kb.nextInt();
            }
        }
        BFS(1, 1);
        System.out.print(answer);
    }

    public static void BFS(int x, int y) {
        int L = 1;
        MoveXY xy = new MoveXY(x, y);
        queue.offer(xy);

        while(!queue.isEmpty()) {
            int qSize = queue.size();

            for (int i = 0; i < qSize; i++) {
                MoveXY move = queue.poll();
                int moveX = move.x;
                int moveY = move.y;

                if (board[moveX+1][moveY] == 0) {
                    board[moveX+1][moveY] = 1;
                    queue.offer(new MoveXY(moveX+1, moveY));
                }
            }
        }
    }
}

class MoveXY {
    public int x,y;

    public MoveXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
