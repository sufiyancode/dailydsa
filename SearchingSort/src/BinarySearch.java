public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3 ,4 ,5 ,6 ,7, 8, 9, 10};

        int result = findSearch(arr, 18);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int findSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;


        while (start<=end){
            int mid = start +(end - start)/2;

            if(arr[mid] == target ){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }

        }
        return -1;
    }

















}
