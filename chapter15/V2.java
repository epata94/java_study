package chapter15;

interface Calculator2 {
    int sum(int a, int b);
//    int mul(int a, int b); 1개이상 람다함수를 사용할 수 없다.
}

class MyCalculator2 implements  Calculator2 {
    public int sum(int a, int b) {
        return a+b;
    }
}

public class V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        MyCalculator2 mc = new MyCalculator2();
        int result = mc.sum(3, 4);
        System.out.println(result);  // 7 출력

	}

}
