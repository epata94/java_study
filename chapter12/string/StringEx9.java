package chapter12.string;

public class StringEx9 {
    public static void main(String[] args) {
        String str1 ="abcd";
        String str2 ="abcd";
// 객체의 메모리 주소를 기반으로 해시 코드를 생성 => 유니크(유일한) 값
        System.out.println("str1 = " +System.identityHashCode(str1));
        System.out.println("str1 = " +System.identityHashCode(str2));
        str1 =  str1 + "efg";
        System.out.println("str1 = "+System.identityHashCode(str1));
    }
}
