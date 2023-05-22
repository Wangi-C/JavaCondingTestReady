package algorithm.chepter_Array.review;

import java.util.Scanner;

public class TempCaptain {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;
        int cnt = 0;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                for (int x = 1; x < 6; x++) {
                    if (arr[i][x] == arr[j][x]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (max < cnt) {
                max = cnt;
                answer = i;
            }

            cnt=0;
        }

        return answer;
    }
}
