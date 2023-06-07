package fastCamp.chapter6.ch02_Lambda;

public class AddTest {

    public static void main(String[] args) {
        Add addL = (x, y) -> {return x+y;};
        Add addL2 = (x, y) -> x+y; //return 문은 반드시 {}안에 있어야함. 매개변수 값 개수가 2개이상이면 무조건 () 필요. 한 문장인 경우 {}생략 가능.
        Add addL3 = (x, y) -> {return x+y;};
        Add addL4 = (x, y) -> {return x+y;};

        System.out.println("addL = " + addL.add(2,3));
    }
}
