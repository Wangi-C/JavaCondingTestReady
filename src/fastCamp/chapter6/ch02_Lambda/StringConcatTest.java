package fastCamp.chapter6.ch02_Lambda;

public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString("Hello", "world");

        StringConcat concat = (s1, s2) -> {
            System.out.println(s1 + "," + s2);
        };
        concat.makeString("Hello", "world_L");
    }
    /**
     * 객체지향 vs 람다식
     * (객체지향) Interface -> Interfase Impl 구현체 -> main에서 구현체 사용
     * (람다식)   Interface (@FunctionalInterface) -> main에서 interface 구현 후 사용
     *
     * 그렇다면 람다식은 정말 구현체 class가 안 만들어질까?
     * No, 실질적으로 내부에서는 람다식을 사용하게 되면 익명 내부 클래스로 변경됨.
     * String concat = new StringConcat() {
     *     public void makeString(String s1, String s2) {
     *
     *     }
     * };
     * */
}
