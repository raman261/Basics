package stringprograms;

public class BiggestSubstring {
    public static void main(String[] args) {
        String sampleString = "this is a new string";
        String[] stringArray = sampleString.split(" ");
        int BiggestStringLength = 0;
        int currentStringLength = 0;
        for(int i = 0; i<stringArray.length; i++)
        {
            currentStringLength = stringArray[i].length();
            if(currentStringLength>BiggestStringLength)
            {
                BiggestStringLength = currentStringLength;
                //biggestString = stringArray[i];
            }
//            biggestString = stringArray[i];
        }
       // System.out.println("biggestString is"+biggestString);
    }
}
