package numberprograms;

//The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:
//4= 1*2*3*4
public class Factorial {
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println("factorial of the number is " + factorial(num));
    }
}
