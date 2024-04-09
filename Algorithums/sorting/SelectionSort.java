package Algorithums.sorting;
// package Algorithums.sorting;
public class SelectionSort{
    public static void main(String[] args){
        int arr[] = {4,23,6,78,19};
        selectionSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+", ");
        }

    }

    static void selectionSort(int arr[], int start, int end){
        int i,j;

        // This outer loop select perticular *index* in sequence
        for(i=start; i<end; i++){
            // This internal loop find the perfect element for that *index*
            for(j=i+1; j<=end; j++){
                // This condition check there is any more deserving element 
                // TODO: if YES: then swap if NO: let it go
                if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j] = temp; 
                }
            }
        }
    }
}
