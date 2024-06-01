package java8feature;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElementsPresentInTheListUsingStreamFunctions {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(listInteger.stream().count());
    }
}
