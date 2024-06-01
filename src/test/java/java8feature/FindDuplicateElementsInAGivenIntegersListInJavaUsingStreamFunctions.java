package java8feature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInAGivenIntegersListInJavaUsingStreamFunctions {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(12,12,13,14,13,15,16,15);
        Set<Integer> setInteger = new HashSet<>();
        listInteger.stream().filter(num->!(setInteger.add(num))).forEach(System.out::println);

    }
}
