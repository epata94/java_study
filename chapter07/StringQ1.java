package chapter07;

public class StringQ1 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        printCharater(str);

    }

    public static void printCharater(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
