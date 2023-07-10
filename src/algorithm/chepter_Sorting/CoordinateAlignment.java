package algorithm.chepter_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoordinateAlignment {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Point> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=kb.nextInt();
            int y=kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}

class Point implements Comparable<Point> {

    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point point) {
        if (point.x == this.x) {
            return this.y - point.y;
        } else {
            return this.x - point.x;
        }
    }
}
