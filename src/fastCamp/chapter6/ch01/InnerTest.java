package fastCamp.chapter6.ch01;

/**
 * 내부클래스 Inner Class
 * 정의 : 하나의 클래스 내부에 선언된 또 다른 클래스를 의미
 * 종류 : 인스턴스 내부 클래스 / 정적 내부 클래스 / 지역 내부 클래스 / **익명 내부 클래스
 * 장점
 * 1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 됩니다.
 * 2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킵니다.
 * 3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있습니다.
 * */

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int iNum = 100;

        void inTest() {
            System.out.println("num = " + num);
            System.out.println("sNum = " + sNum);
            System.out.println("iNum = " + iNum);
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        //정적내부클래스
        int iNum = 100;
        static int sInNum = 300;

        void inTest() {
            System.out.println("iNum = " + iNum);
            System.out.println("sNum = " + sNum);
            System.out.println("sInNum = " + sInNum);
        }

        static void sTest() {
            System.out.println("sNum = " + sNum);
            System.out.println("sInNum = " + sInNum);
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {
        /*OutClass outClass = new OutClass();
        outClass.usingClass(); //InClass가 private인 경우

        OutClass.InClass inner = outClass.new InClass(); //InClass가 private이 아닌경우*/

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();

    }
}
