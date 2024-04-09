// package Algorithums.sorting;


public class InsertionSort {
    public static void main(String[] args) {
        int  arr[] = {9, 8,  7, 6, 5};
        insertionSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }

    static void insertionSort(int[] arr, int start, int end){
        int i, j;
        for (i = 1; i <= end; i++) {
            int value= arr[i];
            int index = i;
            
            while (index>0 && arr[index-1]>value) {
                arr[index]=arr[index - 1];
                index--;
            }
            arr[index]=value;
        }
    }
    
}
