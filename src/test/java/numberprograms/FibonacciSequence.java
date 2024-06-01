package numberprograms;

//A Fibonacci sequence is one in which each number is the sum of the two previous numbers.
// In this example, the sequence begins with 0 and 1. The following example code shows how to
// use a for loop to print a Fibonacci sequence: 0,1,1,2,3,5
public class FibonacciSequence {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        System.out.println(firstNumber+" "+secondNumber);

        for (int i = 2; i < 20; i++) {
            thirdNumber = firstNumber + secondNumber;
           System.out.println(thirdNumber);
            firstNumber = secondNumber;
           secondNumber = thirdNumber;
        }
    }
}
