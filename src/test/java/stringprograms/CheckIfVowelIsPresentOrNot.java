package stringprograms;

public class CheckIfVowelIsPresentOrNot
{
    public static Boolean checkIfStringContainsVowels(String inputString)
    {
       return inputString.matches(".*[aeiou]*.");
    }
    public static void main(String[] args) {
        String vowel = "aeiou";
        String testString = "samplestring";
        if(checkIfStringContainsVowels(testString))
        {
            System.out.println("Given string contains vowel");
        }
    }

}
