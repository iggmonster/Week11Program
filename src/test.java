import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static <E extends Comparable<E>> void main(String[] args) {
        Sorts sorts = new Sorts();
        List<Integer> list = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        System.out.println(list);
        System.out.println();
        Sorts.bubblesort(list, 0, 5, Sorts.SortOrder.ASCENDING);
        Sorts.bubblesort(list, 0, 5, Sorts.SortOrder.DESCENDING);
        System.out.println();
        Sorts.insertionsort(list, 0, 5, Sorts.SortOrder.ASCENDING);
        Sorts.insertionsort(list, 0, 5, Sorts.SortOrder.DESCENDING);
        System.out.println();
        Sorts.selectionsort(list, 0, 5, Sorts.SortOrder.ASCENDING);
        Sorts.selectionsort(list, 0, 5, Sorts.SortOrder.DESCENDING);
        System.out.println();
        List<Integer> list2 = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        Sorts.mergesort(list2, 0, 6, Sorts.SortOrder.ASCENDING);
    }

}
