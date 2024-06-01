package collectionprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Reversealinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList
                = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(23);
        linkedList.add(54);
        linkedList.add(78);

        //ListIterator<Integer> listIterator = linkedList.listIterator();
        Iterator<Integer> descendingListIterator = linkedList.descendingIterator();
        while(descendingListIterator.hasNext())
        {
            System.out.println(descendingListIterator.next());
        }
    }
}
