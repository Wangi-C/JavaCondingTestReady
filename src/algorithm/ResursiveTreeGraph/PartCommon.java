package algorithm.ResursiveTreeGraph;

public class PartCommon {
    static int n;
    static int[] ch;
    public static void main(String[] args){
        n=3;
        ch=new int[n+1];
        DFS(1);
    }

    public static void DFS(int L) {
        if (L == n+1) {
            for (int i = 1; i < n+1; i++) {
                if (ch[i] == 1) {
                    System.out.print(i);
                }
            }
            System.out.println();
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }
}
