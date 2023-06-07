package fastCamp.chapter6.ch02_Lambda;

public class ShowStringTest {
    public static void main(String[] args) {
        //람다식을 변수에 대입
        PrintString printString = s1 -> System.out.println(s1);
        printString.showString("hello wangi");

        showMyString(printString);

        PrintString printString1 = returnString();
        printString1.showString("안녕");
    }

    //매개변수로 전달하는 람다식
    public static void showMyString(PrintString printString) {
        printString.showString("hello wangi_2");
    }

    //반환 값으로 쓰이는 람다식
    public static PrintString returnString() {
        return s-> System.out.println(s + "hello wangi");
    }
}
