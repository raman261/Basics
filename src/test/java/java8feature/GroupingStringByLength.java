package java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Group a list of strings by their length using a lambda expression and Java 8 Streams.
public class GroupingStringByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        Map<Integer, List<String>> groupByLength = words.stream().collect(Collectors.groupingBy(String::length));
        groupByLength.forEach((length, list) -> {
            System.out.println("length:"+ length);
            list.forEach(word ->System.out.println(" "+word));
        });
    }
}
