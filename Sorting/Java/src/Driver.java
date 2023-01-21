public class Driver {

    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        QuickSort quickSort = new QuickSort();
        int [] unsorted = {16, 2, 8,8, 18,18,13};


        System.out.println("Unsorted");
        printArray(unsorted);

        int n = unsorted.length-1;

//        int [] sorted = selectionSort.sortMod(unsorted);
        int [] sorted = quickSort.quicksort(unsorted,0,n);

        System.out.println("\nSorted");
        printArray(sorted);

    }

    public static void printArray(int[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
