package numberprograms;

public class CheckIfGivenNumberIsPrimeOrNot {

    public static Boolean checkIfPrimeOrNot(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 4;
        if (checkIfPrimeOrNot(num)) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }
    }
}
