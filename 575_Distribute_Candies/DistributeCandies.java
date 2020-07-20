import java.util.stream.*;
import java.util.Arrays;

public final class DistributeCandies {
    public static void main(String... args) {
        int[] testInput1 = {1,1,2,2,3,3};
        distribute(testInput1);
        int[] testInput2 = {1,1,2,3};
        distribute(testInput2);
    }

    public static Long distribute(int[] candies) {
        Long x;
        int n = candies.length;
        // validate input
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Number of candies must be even.");
        }

        // use a stream to count how many kinds of candy
        Long k = IntStream.of(candies)
                .distinct()
                .count();

        // this is the solution
        x = (k >= n/2) ? n/2 : k;

        System.out.println(x);// expect 3, then 2

        return x;
    }
}