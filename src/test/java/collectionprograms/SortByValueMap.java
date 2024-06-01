package collectionprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByValueMap {
    public static Map<Integer, String> reverseMapByValue(Map<Integer, String> mapToSort) {
        Map<Integer, String> outputMap = new HashMap<>();

        /*for (Map.Entry<String, Integer> entry : mapToSort.entrySet()) {


        }*/
        return null;
    }
    public static void main(String[] args) {
        Map<String, Integer> mapToSort= new HashMap<>();
        mapToSort.put("Ram", 21);
        mapToSort.put("Shyam", 24);
        mapToSort.put("Radha", 22);
        mapToSort.put("Mohan", 12);

        Map<String, Integer> sortedMap= new TreeMap<>(mapToSort);

        System.out.println(sortedMap);


    }
}
