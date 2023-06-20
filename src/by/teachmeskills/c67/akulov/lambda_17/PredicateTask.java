package by.teachmeskills.c67.akulov.lambda_17;

import java.util.function.Predicate;

public class PredicateTask {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        int[] arrInt = {1, -8, 53, -93, 71, 250, 0, -3, -81, 137};
        for (int value : arrInt) {
            if (isPositive.test(value)) {
                System.out.println(value);
            }
        }
    }
}
