package java8feature;

import java.util.Arrays;
import java.util.List;

//Filter a list of integers to include only even numbers using a lambda expression.
public class FilterIntegers {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> evenIntegerList = listInteger.stream().filter(num -> num%2==0).toList();
        evenIntegerList.forEach(System.out::println);
    }
}
