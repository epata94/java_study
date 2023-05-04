package chapter13;

public class StringCompareTest {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "banana";

//        int result = str1.compareTo(str2); // -1
//        int result = str2.compareTo(str1); // 1
        int result = str2.compareTo(str3); // 0
// soutv: 바로 앞에 있는 변수에 대해서 println해주는 코드를 자동생성한다.
// [기준문자열].compareTo([비교문자열])
// 기준문자열이 비교문자열 보다 작은 경우 음수(-1) 반환
// 기준문자열이 비교문자열 보다 큰 경우 양수(1) 반환
// 기준문자열이 비교문자열과 같은 경우  (0) 반환

        System.out.println("result = " + result);
        if (result < 0) {
            System.out.println("str1 is smaller than str2");
        } else if (result > 0) {
            System.out.println("str1 is larger than str2");
        } else {
            System.out.println("str1 is equal to str2");
        }
    }
}
