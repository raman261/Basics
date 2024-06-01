package java8feature;

import java.util.function.Function;

//factoria is multipication of numbers begining from the number itself decrementing till 1
public class CalculateFactorialUsingLambda {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = new Function<>() {
            @Override
            public Integer apply(Integer n) {
                if (n == 0) {
                    return 1;
                }
                return n * this.apply(n - 1);
            }
        };

        int number = 5;
        int result = factorial.apply(number);

        System.out.println("Factorial of " + number + " is " + result);

    }
}
