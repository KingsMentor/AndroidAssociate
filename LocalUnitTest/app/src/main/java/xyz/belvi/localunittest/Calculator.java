package xyz.belvi.localunittest;

/**
 * Created by zone2 on 1/7/17.
 */

public class Calculator {
    public int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public boolean greaterThan(int value1, int value2) {
        return value1 > value2;
    }
}
