package fastCamp.chapter6.ch03_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("wangi");
        list.add("jaewond");

        Stream<String> stream = list.stream(); //stream : Collection의 메소드
        stream.forEach(s-> System.out.println("s = " + s));

        list.stream().sorted().forEach(s-> System.out.println("s_1 = " + s));
        list.stream().map(s->s.length()).forEach(n-> System.out.println("n = " + n)); //객체에 대한 Object 처리를 할 경우 map
        list.stream().filter(s->s.length() > 5).forEach(s-> System.out.println("s = " + s)); //문자열 길이가 5이상인 애들만 출력

        /*****/
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(n -> System.out.println("n = " + n));
        System.out.println();

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int sum2 = arrayList.stream().mapToInt(n->n.intValue()).sum();
        System.out.println("sum2 = " + sum2);
    }
}
