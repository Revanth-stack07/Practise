public class Celing {

    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(celingOfArray(array,target));
    }
    static int celingOfArray(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2 ;
            if( target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                // if the target is return the target.
                return arr[mid];
            }
        }
        // if the target is not found in the array,
        // return the next smallest element in the array and >= target.
        return arr[start];
    }
}
