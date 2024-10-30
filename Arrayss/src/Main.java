import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] ros;
//        int[] newarray = new int[5];
//        int[] arr = {2, 4 ,5 ,6 ,7};
//        ros = new int[]{2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(ros));
//        System.out.println(Arrays.toString(newarray));
//


        // 1) Array objects are in heap
        // 2) heap objects are not continuous
        // dynamic memory allocation
//        ** New is used to create an Object new int[3];

        int[]arr = {2, 3, 4};
        String str = "asdf";
        String[] str2 = new String[4];


        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for( int num: arr){ // for every element in array, print the element
            System.out.println(num + " ");
        }
//        System.out.println(arr[3]);  // Index out of bound error

    }
}