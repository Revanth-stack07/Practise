import java.util.Arrays;

public class PrintTriangle {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
   printTriangle(arr); 
    }

    private static void printTriangle(int[] arr) {
         if (arr.length < 1)
           return;

         int arr1[] = new int[arr.length-1];
         for (int i =0; i<arr.length-1; i++){
              int temp = (arr[i])+(arr[i+1]);
              arr1[i] = temp;
            }
            printTriangle(arr1);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(arr));
        
     }
        
        
}

    




