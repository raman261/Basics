package numberprograms;//it should be divisible by 1 and itself

//given 2 number, in between those 2 numbers we need to find all the prime numbers 1, 3, 5, 7
public class PrimeNumberProgram {
    public static Boolean isPrimeOrNot(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0)
            {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 50;
        for (int i = firstNumber; i < lastNumber; i++) {
            if (isPrimeOrNot(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}
