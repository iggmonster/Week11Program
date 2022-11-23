import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.*;


public class SortTest {

    //Bubble Sort Tests:
    @Test
    public void bubbleSortTestGeneral() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTestEmptyList() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList());
        List<Integer> bList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList());
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTest1Element() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTest2Elements() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTest3Elements() {
        Sorts sorts = new Sorts();

        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTest100Elements() {
        Sorts sorts = new Sorts();
        //100 random numbers between 0 and 150
        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTestPreAscending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void bubbleSortTestPreDescending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(cList);
        Sorts.bubblesort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.bubblesort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }




    //Insertion Sort Tests:
    @Test
    public void insertionSortTestGeneral() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTestEmptyList() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList());
        List<Integer> bList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList());
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTest1Element() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTest2Elements() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTest3Elements() {
        Sorts sorts = new Sorts();

        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTest100Elements() {
        Sorts sorts = new Sorts();
        //100 random numbers between 0 and 150
        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTestPreAscending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void insertionSortTestPreDescending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(cList);
        Sorts.insertionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.insertionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }




    //Selection Sort Tests:
    @Test
    public void selectionSortTestGeneral() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(15, 12, 99, 98, 97, 18, 3, 14, 2, 1, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTestEmptyList() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList());
        List<Integer> bList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList());
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList());

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTest1Element() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTest2Elements() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTest3Elements() {
        Sorts sorts = new Sorts();

        List<Integer> cList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(12, 3, 365));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(12, 3, 365));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTest100Elements() {
        Sorts sorts = new Sorts();
        //100 random numbers between 0 and 150
        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(8,47,140,40,0,108,123,1,117,126,88,
                        17,53,37,42,76,26,116,95,124,16,25,96,74,
                        32,36,51,100,68,115,84,21,6,129,77,80,131,
                        64,75,72,114,122,23,78,81,4,121,92,44,60,65,
                        29,19,41,48,30,90,125,146,9,71,149,35,14,
                        45,52,12,15,50,69,142,107,113,103,139,135,
                        85,58,10,150,102,24,133,34,27,38,138,20,141,
                        79,106,13,63,143,55,110,31,67,134,43));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTestPreAscending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
    @Test
    public void selectionSortTestPreDescending() {
        Sorts sorts = new Sorts();

        //ascending
        List<Integer> cList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> bList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(cList);
        Sorts.selectionsort(bList, 0, bList.size(), Sorts.SortOrder.ASCENDING);

        Assert.assertEquals(cList, bList);

        //descending
        List<Integer> dcList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));
        List<Integer> dbList = new ArrayList<>(
                Arrays.asList(5, 4, 3, 2, 1));

        Collections.sort(dcList, Collections.reverseOrder());
        Sorts.selectionsort(dbList, 0, bList.size(), Sorts.SortOrder.DESCENDING);
    }
}