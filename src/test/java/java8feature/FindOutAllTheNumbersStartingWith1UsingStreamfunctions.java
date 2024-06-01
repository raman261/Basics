package java8feature;

import java.util.Arrays;
import java.util.List;
//map is for modifying the values
//filter is to filter the values according to the condition(if-else)
//
public class FindOutAllTheNumbersStartingWith1UsingStreamfunctions {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(12, 13, 22, 14, 23, 15, 16);
        listInteger.stream().map(num -> num + "").filter(num -> num.startsWith("1")).toList().forEach(System.out::println);
    }
}
