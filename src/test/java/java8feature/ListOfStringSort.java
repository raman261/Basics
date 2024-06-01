package java8feature;

//in this example we are sorting a list of strings using lambda function
import java.util.Arrays;
import java.util.List;

public class ListOfStringSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("one", "two", "three", "four", "five");
        names.sort((s1,s2)->s1.compareTo(s2));

        names.forEach(System.out::println);
    }
}
