package chapter11;

public class Test {

    public static void main(String[] args) {
        if (true) {
            methodA();
        } else {
            methodB();
        }
    }

    private static void methodB() {
        try {
            methodC(1);
        } catch (Exception e) {

        }
    }

    private static void methodC (int x) throws Exception {
        System.out.println(x / 0);
    }

    private static void methodA() {
        try {
            methodC(3);
        } catch (Exception e) {

        }
    }
}
