package algorithm.chepter_RecursiveTreeGraph;

public class Recursive {


    public void DFS(String str, String findStr, int findStartIdx) {

        if (findStartIdx >= str.length()) {
            return;
        } else {
            int findIdx = str.indexOf(findStr, findStartIdx);
            if (findIdx < 0) {
                System.out.println("못 찾음");
                return;
            } else {
                if (findIdx > 0) {
                    char preChar = str.charAt(findIdx-1);
                    if (48 > preChar || preChar > 57) {
                        //문자형
                        String preStr = str.substring(0,findIdx);
                        String postStr = str.substring(findIdx+findStr.length());

                        str = preStr + postStr;
                    }
                } else if (findIdx == 0) {
                    str = str.substring(findIdx+findStr.length());
                }

                System.out.println(str);

                DFS(str, findStr, (findIdx+findStr.length()));
            }
        }
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        recursive.DFS("1개*15ml+13통-1매+3통", "3통", 0);
    }
}
