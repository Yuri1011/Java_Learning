package Section_1;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for (int i = 0; i <= 1_000_000_000; i++) {
            System.currentTimeMillis();
        }

        long result = System.nanoTime() - time;
        System.out.println((double) result / 1_000_000_000 + " seconds");

    }
}
