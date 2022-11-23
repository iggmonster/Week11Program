import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sorts {
   public enum SortOrder { ASCENDING, DESCENDING }

   public static <E extends Comparable<E>> void bubblesort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      E cache;
      int swaps = 0;
      int doSwap = -1;
      if (sortOrder == SortOrder.DESCENDING){
         doSwap = 1;
      }
      while (true){
         swaps = 0;
         for (int i = lowindex; i < highindex - 1; i++) {
            //if (list.get(highindex - i + 1).compareTo(list.get(highindex - i)) > 0) {
            if ((list.get(i + 1).compareTo(list.get(i))) * doSwap > 0) {
               cache = list.get(i + 1);
               list.set((i + 1), list.get(i));
               list.set((i), cache);
               swaps++;
            }
         }
         if (swaps == 0){
            break;
         }
      }
      System.out.println(list);
   }

   public static <E extends Comparable<E>> void insertionsort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      for (int i = lowindex; i < highindex; i++){
         E cache = list.get(i);
         int j = i - 1;
         int doSwap = -1;
         if (sortOrder == SortOrder.ASCENDING){
            doSwap = 1;
         }
         while ((j > -1) && ((list.get(j).compareTo(cache)) * doSwap > 0)){
            list.set(j + 1, list.get(j));
            j--;
         }
         list.set(j + 1, cache);
      }
      System.out.println(list);
   }

   public static <E extends Comparable<E>> void selectionsort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      E cache;
      int lowest;
      int doSwap = -1;
      if (sortOrder == SortOrder.ASCENDING){
         doSwap = 1;
      }
      for (int i = lowindex; i < highindex; i++){
         lowest = i;
         for (int j = i + 1; j < highindex; j++){
            if ((list.get(j).compareTo(list.get(lowest))) * doSwap < 0){
               lowest = j;
            }
         }
         cache = list.get(i);
         list.set(i, list.get(lowest));
         list.set(lowest, cache);
         //System.out.println(list);
      }
      System.out.println(list);
   }

   public static <E extends Comparable> void mergesort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      List<E> mergeList = new ArrayList<E>(highindex - lowindex);
      for (int i = lowindex; i < highindex; i++){
         mergeList.add(list.get(i));
      }
      System.out.println(mergeList);
      if (lowindex < highindex) {
         doMergeSort(mergeList, sortOrder);
      }
      else {
         System.out.println("lowindex was less than highindex");
      }
   }
   private static <E extends Comparable> List<E> doMergeSort(List< E > list, SortOrder sortOrder){
      int midpoint;
      midpoint = list.size() / 2;
      System.out.println(midpoint);

      if (list.size() != 1) {
         List<E> leftList = new ArrayList<>(Arrays.asList());
         List<E> rightList = new ArrayList<>(Arrays.asList());

         for (int i = 0; i < midpoint; i++) {
            leftList.add(list.get(i));
         }
         for (int i = midpoint; i < list.size(); i++) {
            rightList.add(list.get(i));
         }
         System.out.println(leftList);
         System.out.println(rightList);

         List<E> doneLeftList = new ArrayList<E>();
         List<E> doneRightList = new ArrayList<E>();
         doneLeftList.add(doMergeSort(leftList,sortOrder));
      }
      else {
         return list;
      }
      return list;
   }

   public static <E extends Comparable<E>> void mysort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      // YOUR CODE HERE
   }
}