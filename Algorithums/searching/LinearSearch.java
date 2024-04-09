
public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 23, 89, 45, 67};
        int key = 45;
        int foundAt = linearSearh(array, key, 0, array.length-1);

        if(foundAt != -1){
            System.out.println("Element is present at index " + foundAt);
        }else{
            System.out.println("Element is not present in the array");
        }
    }

    static int linearSearh(int[] array, int key, int start, int end) {
       for (int i = start; i <= end; i++) {
         if (array[i] == key) {
            return i;
         }
       }
       return -1;
    }

    
}
