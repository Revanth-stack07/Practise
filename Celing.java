public class Celing {

    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int target = 4;
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
                return arr[mid];
            }
        }
        return arr[end];
    }
}
