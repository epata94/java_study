package chapter12;

public class Q3 {
    public static void main(String[] args) {
        String str = "나는 자바 프로그래밍을 배우고 있습니다.";
        String searchStr = "프로그래밍";

// indexOf() 메소드를 사용하여 문자열에서 특정 문자열의 인덱스를 확인합니다.
        int index = str.indexOf(searchStr);

        if (index != -1) {
            System.out.println("문자열에서 '" + searchStr + "'이(가) 위치한 인덱스: " + index);
        } else {
            System.out.println("문자열에 '" + searchStr + "'이(가) 포함되어 있지 않습니다.");
        }
    }
}
