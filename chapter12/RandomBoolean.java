package chapter12;
import java.util.Random;
public class RandomBoolean {
    public static void main(String[] args) {
        Random rand = new Random(7);

        for (int i = 0; i < 10; i++) {
            boolean bool = rand.nextBoolean();
            System.out.println(bool);
        }
    }
}
