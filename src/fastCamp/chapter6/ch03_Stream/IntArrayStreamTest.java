package fastCamp.chapter6.ch03_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int n : arr) {
            System.out.println("n = " + n);
        }

        System.out.println();
        //forEach : 하나씩 꺼내라
        // is라는 스트림 객체는 한번 사용하고 나면 재사용 불가능하다. -> 새로운 Stream을 만들어줘야함
        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println("n = " + n));
        
        Arrays.stream(arr).forEach(n -> System.out.println("n = " + n));

        int sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);
        
    }
}
