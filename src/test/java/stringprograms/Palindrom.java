package stringprograms;

public class Palindrom {
    public static Boolean palindromOrNot(String inputString)
    {
        if (inputString.length()<2)
        {
            return true;
        }
        else {
            if(inputString.charAt(0) != inputString.charAt(inputString.length()-1))
            {
                return false;
            }
            else {
                return palindromOrNot(inputString.substring(1,inputString.length()-1));
            }

        }

    }
    public static void main(String[] args) {
       String inputString = "abba";
        if(palindromOrNot(inputString))
        {
            System.out.println("It's a palindrom");
        }
        else {
            System.out.println("It's not a palindrom");
        }
    }
}
