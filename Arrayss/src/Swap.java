import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 5 ,6};

        //  Swap functionality
        System.out.println("Before: "+Arrays.toString(arr));
//        System.out.println(max(arr));
//        swap(arr, 0, 4);
          reverse(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
//    static int max(int[] arr){
//
//        int maxval = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>maxval){
//                maxval = arr[i];
//            }
//
//        }
////        System.out.println(maxval);
//
//        return maxval;
//    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
