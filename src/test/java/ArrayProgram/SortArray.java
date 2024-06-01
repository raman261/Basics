package ArrayProgram;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] arrayToSort = {1, 2, 4, 2, 5};
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                   int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        System.out.println(arrayToSort);
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.println(arrayToSort[i]);
        }
    }
}
