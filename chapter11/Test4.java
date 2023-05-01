package chapter11;

public class Test4 {
    public static void main(String[] args) {

        try {
            if (false) {
                methodA();
            } else {
                methodB();
            }
        } catch (Exception e) {
            System.out.println("예외발생: "+e);
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
    private static void methodA () throws Exception{
        myLogic();
    }
    private static void methodB () throws Exception{
        myLogic();
    }
    private static void myLogic () throws Exception {
        System.out.println(1/0);
    }
    private static void myLogic2 (int num1, int num2) throws Exception {
        System.out.println(num1/num2);
    }
}
