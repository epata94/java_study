package chapter07;
// 인텔리제이에서 클래스에 art+insert통해서 생성자, Getter, Setter 메소드를 자동생성할 수 있다.
public class Test {



    private int myValue;
    private int myName;

    public Test(int myValue, int myName) {
        this.myValue = myValue;
        this.myName = myName;
    }

    public static void main(String[] args) {

    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyName() {
        return myName;
    }

    public void setMyName(int myName) {
        this.myName = myName;
    }
}
