package chapter07;

public class StringMethod {
    // String(문자열) 클래스에서 제공하는 주요 함수
    public static void main(String[] args) {
//        String str ="Hello World!";
        String str = new String("Hello World!");
        String num1="123";
        String num2="456";
        System.out.println(num1+num2);
        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));

        System.out.println(String.valueOf(43242));

        // length(): 문자열의 길이 반환
        System.out.println(str.length());

        // charAt([인덱스 번호]): 해당 인덱스의 문자 반환
        System.out.println(str.charAt(6));

        // substring([시작인덱스],[끝인덱스]): 해당 인덱스 사이의 스트링 반환
        System.out.println(str.substring(0,5));

        // indexOf([문자]): 해당 문자가 발견되는 첫번째 인덱스 반환
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("l"));
        // indexOf([문자],[from 인덱스]): 5번인덱스 이후에 처음나오는 l
        System.out.println(str.indexOf("l",5));

        // replace([타겟 스트링],[교체할 스트링]) 첫번째 인자 값을 두번째 인자값으로 변경
        String newStr = str.replace("World", "Hyunkoo");
        System.out.println(newStr);

//        str.

        String greetingMessage1 = "Hello";
        String blank =" ";
        String target="World!";
        System.out.println(greetingMessage1+blank+target);

        String greetingMessage2 = "   Hello  ";
        System.out.println(greetingMessage2+blank+target);

        // trim(): 문자열내 공백 문자 제거
        System.out.println(greetingMessage2.trim());
        System.out.println(greetingMessage2.trim().length());
        System.out.println(greetingMessage2.trim()+blank+target);

        // equals("비교문자열") : 같으면 true, 틀리면 false
        if (target.equals("World!")){
            System.out.println("같습니다.");
        }

        if (target.equals("Hyunkoo!")){
            System.out.println("같습니다.");
        }
        // target: World!
        // startsWith("비교문자열"): 비교문자열로 시작하면 true, 아니면 false
        if(target.startsWith("Wor")){
            System.out.println("찾았습니다");
        }

    }
}
