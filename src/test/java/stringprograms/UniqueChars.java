package stringprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Hi this is interview going
public class UniqueChars {
    public static void main(String[] args) {

        String s="Hiii thhiiis isss innteeervieeww goooinggg";
        String[] listOfString = s.split(" ");

        for (String valueInString:listOfString) {
        char[] charOfString = valueInString.toCharArray();
            HashSet<Character> set = new HashSet(Arrays.asList(charOfString));
        }



//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

    }



}
