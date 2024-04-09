public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 7;
        int foundAt = binarySearch(arr, key, 0, arr.length - 1);

        if(foundAt != -1){
            System.out.println("Element is present at index " + foundAt);
        }else{
            System.out.println("Element is not present in the array");
        }
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;

    }
}
