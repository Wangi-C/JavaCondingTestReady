package algorithm.ResursiveTreeGraph.review;

public class PartCommon {

    public static int L;
    public static int[] intArr;
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 3;
        L = i+1;
        intArr = new int[L];
        DFS(1);
    }

    public static void DFS(int n) {
        if (L == n) {
            for (int i = 1; i < L; i++) {
                if (intArr[i] != 0) {
                    System.out.print(i + " ");

                }
            }
            System.out.println("");
        } else {
            intArr[n] = 1;
            DFS(n+1); //왼쪽으로
            intArr[n] = 0;
            DFS(n+1); //오른쪽으로
        }
    }
}
