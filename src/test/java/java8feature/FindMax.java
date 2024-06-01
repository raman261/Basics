package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find max using lambda
public class FindMax {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(1,5,3,2,2,9,8,6);
        Optional<Integer> maxNumber = listOfInteger.stream().reduce((a, b)->a>b?a:b);
        listOfInteger.stream().max(Integer::compare).stream().forEach(System.out::println);
//        maxNumber.ifPresent(max -> System.out.println(""+ max));
    }
}
