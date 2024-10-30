public class OrderAgnosticBS {
    public static void main(String[] args){
//        int[] arr = {98, 87, 76, 65, 45,43,32, 21,11};
        int[] arr = { 1, 3, 4, 5 ,6 ,7 ,8 ,9};
        int result = orderAgnosticBS(arr, 8);
        if(result== -1) System.out.println("Element not found");
        else {
            System.out.println("Element is at index: "+ result);
        }
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc= arr[0]<arr[end];
        if(isAsc){
            while (start<=end){
                int mid = start + (end -start)/2;

                if(arr[mid]==target) return mid;

                if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        else {
            while (start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]== target){
                    return mid;
                }
                if(target>arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid  +1;
                }
            }
        }
        return -1;
    }
}
