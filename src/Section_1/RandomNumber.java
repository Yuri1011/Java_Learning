package Section_1;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Random number == "+ number);
    }
}
