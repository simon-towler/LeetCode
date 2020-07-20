import java.util.stream.*;
import java.util.Arrays;

public final class DistributeCandies {
    public static void main(String... args) {
        int[] testInput = {1,1,2,2,3,3};
        distribute(testInput);
    }

    public static long distribute(int[] input) {
        int n = input.length;

        Long k = IntStream.of(input)
                .distinct()
                .count();

        System.out.println(k);// expect 3

        return k;
    }
}