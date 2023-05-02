package chapter12;

public class P326 {
    public static void main(String[] args) {
        // rint: 0.5인 경우 가장 가까운 짝수로 반올림,  그 이외의 경우는 round()의 결과와 동일
        double x= 2.4;
        double y= 3.4;

        System.out.println("x: "+ Math.round(x));
        System.out.println("y: "+Math.round(y));
        System.out.println("x: "+Math.rint(x));
        System.out.println("y: "+Math.rint(y));

        x= 2.5;
        y= 3.5;

        System.out.println("x: "+Math.round(x));
        System.out.println("y: "+Math.round(y));
        System.out.println("x: "+Math.rint(x));
        System.out.println("y: "+Math.rint(y));

        x= 2.6;
        y= 3.6;

        System.out.println("x: "+Math.round(x));
        System.out.println("y: "+Math.round(y));
        System.out.println("x: "+Math.rint(x));
        System.out.println("y: "+Math.rint(y));
    }
}
