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
      // YOUR CODE HERE
   }

   public static <E extends Comparable> void mergesort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      // YOUR CODE HERE
   }

   public static <E extends Comparable<E>> void mysort ( List< E > list, int lowindex, int highindex, SortOrder sortOrder ) {
      // YOUR CODE HERE
   }
}