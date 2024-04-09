public class BubbleSort {
    public static void main(String[] args) {
        int  arr[] = {9, 8,  7, 6, 5};
        bubbleSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+", ");
        }
    }

    static void bubbleSort(int[] arr, int start, int end){
        boolean isSwapped = false;
        int i, j;
        for (i = start; i < end; i++) {
            for (j = start; j < end-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp; 
                    isSwapped = true;
                }
                if(!isSwapped){
                    break;
                }
            
            }
        }
    }
}
