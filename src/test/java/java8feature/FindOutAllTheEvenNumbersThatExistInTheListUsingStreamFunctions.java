package java8feature;

import java.util.Arrays;
import java.util.List;

public class FindOutAllTheEvenNumbersThatExistInTheListUsingStreamFunctions {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(12,14,15,89,11,23);
        listInteger.stream().filter(num->num%2==0).forEach(System.out::println);
    }
}
