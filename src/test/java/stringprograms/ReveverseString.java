package stringprograms;

public class ReveverseString {
    public static void main(String[] args) {
        String inputString = "inputString";
/*        String reverseString = "";
        for (int i = inputString.length()-1; i >=0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println(reverseString);*/
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = inputString.length()-1; i >=0; i--) {
            stringBuilder = stringBuilder.append(inputString.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
