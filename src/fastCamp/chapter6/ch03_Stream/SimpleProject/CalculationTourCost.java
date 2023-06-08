package fastCamp.chapter6.ch03_Stream.SimpleProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class CalculationTourCost {
    //여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다.
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("이순신", 40, 100));
        list.add(new Customer("김유신장", 20, 100));
        list.add(new Customer("홍길동", 13, 50));

        //고객 명단 추가된 순서대로 출력
        list.stream().map(c -> c.getName()).forEach(c-> System.out.println("c = " + c));

        //총 여행 비용
        System.out.println(list.stream().mapToInt(c -> c.getCost()).sum());

        //20세 이상 인원의 비용
        System.out.println("20세 이상 인원의 비용 : " + list.stream().filter(c -> c.getAge() >= 20).mapToInt(c -> c.getCost()).sum());

        //20세 이상 고객 명단 정렬하여  - 오름차순
        list.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(c -> System.out.println("c = " + c));

        //20세 이상 고객 명단 정렬하여  - 내림차순
        list.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted(Collections.reverseOrder()).forEach(c -> System.out.println("c = " + c));
    }
}
