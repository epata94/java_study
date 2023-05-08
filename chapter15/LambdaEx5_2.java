package chapter15;
class MyOuter {
    private int outerField = 1;

    class MyInner {
        private int innerField = 2;

        public void printFields() {
//            중첩 클래스 구조에서 외부 클래스의 인스턴스변수 접근하는 방법
//              [외부클래스명].this.[외부클래스의 인스턴스변수명]
            System.out.println("outerField: " + MyOuter.this.outerField);
            System.out.println("innerField: " + this.innerField);
        }
    }
}
public class LambdaEx5_2 {
    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        MyOuter.MyInner inner = outer.new MyInner();
        inner.printFields();
    }
}
