package chapter12;
import java.util.Random;
public class RandomBytes {
    public static void main(String[] args) {
        Random rand = new Random();
        byte[] bytes = new byte[5];

        rand.nextBytes(bytes);

    }
}
