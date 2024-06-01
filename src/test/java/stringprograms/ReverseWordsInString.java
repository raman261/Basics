package stringprograms;

//Output emocleW ot egrofoc detimil
public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Welcome to coforge limited";
        String[] stringArray = str.split(" ");

        for (int i = 0; i < stringArray.length; i++)
        {
            for (int j = stringArray[i].length()-1; j >= 0 ; j--) {
                System.out.print(stringArray[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
