package fastCamp.chapter6.ch01;

class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 10;

        return new Runnable() {

            int localNum = 1000;
            @Override
            public void run() {

                //가져가서 쓰는 것은 오류가 안나는데 바꿀려니까 오류가 난다. -> getRunnable이 생성되고 없어지는 경우 i, num 변수도 같이 없어진다.
                //하지만 MyRunnable의 run은 여전히 사용될 여지가 있기 때문에 i와 num을 변경하지 못한다.
                /*i = 50;
                num = 20;*/

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum);
                System.out.println("Outer.sNum = " + Outer2.sNum);
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable class");
        }
    };
}

public class AnonumousInnerTest {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable runnable = outer2.getRunnable(100);

        runnable.run();

        //다른 데서는 사용하지 않는 getRunnable을 굳이 이름을 주면서까지 class를 만들어줘야하나? -> 익명내부클래스
        outer2.runnable.run();
    }
}
