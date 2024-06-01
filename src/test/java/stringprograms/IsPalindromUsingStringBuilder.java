package stringprograms;

public class IsPalindromUsingStringBuilder {
    public static void main(String[] args) {
        String inputString = "samplestring";

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = inputString.length()-1; i >= 0; i--) {
            stringBuilder = stringBuilder.append(inputString.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
