package chapter12;

public class Q2 {
    public static void main(String[] args) {
        String str = "나는 자바 프로그래밍을 배우고 있습니다.";
        String searchStr = "프로그래밍";

// contains() 메소드를 사용하여 문자열에 특정 문자열이 포함되어 있는지 확인합니다.
        boolean result = str.contains(searchStr);

        if (result) {
            System.out.println("문자열에 '" + searchStr + "'이(가) 포함되어 있습니다.");
        } else {
            System.out.println("문자열에 '" + searchStr + "'이(가) 포함되어 있지 않습니다.");
        }
    }
}
