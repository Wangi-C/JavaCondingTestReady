package fastCamp.chapter6.ch02_Lambda;

@FunctionalInterface
public interface Add {
    // 함수형 인터페이스
    // 람다식을 선언하기 위해 사용
    // 단 하나으 메소드만을 선언. -> 이름을 안쓰기 때문에 어떤 메소드를 쓸지 모호해짐. -> @FunctionalInterface 사용 -> 함수형인터페이스에 다수의 메소드를 선언하지 않도록 방지해줌.

    public int add(int x, int y);
//    public int sub(int a, int b);
}
