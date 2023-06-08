package fastCamp.chapter6.ch03_Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        //1.람다식 reduce구현
        String[] greetings = {"안녕하세요~", "hello", "Goods Morning", "반갑습니다." };
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }));

        //2.BinaryOperator 구현체를 만들어서 사용.
        System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
    }
}
