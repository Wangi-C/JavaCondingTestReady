package algorithm.chepter_Array;

import java.util.HashMap;
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
        int max = Integer.MIN_VALUE;
        int answer = 0;

        for (int i = 1; i < n+1; i++) {
            int cnt = 0;
            for (int j = 1; j < n+1; j++) {
                for (int x = 1; x <= 5; x++) {
                    // 주의 : 한번이라도 같은 반이였던 학생을 찾는것이 목표이기 때문에
                    if (arr[i][x] == arr[j][x]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
}
