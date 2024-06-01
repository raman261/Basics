package java8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 1);
        //System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
//        arrayList.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println("arrayList arrayList arrayList".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
