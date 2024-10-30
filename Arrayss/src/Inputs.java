import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        // Array of Premetive

//        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
//        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//
//        System.out.println(Arrays.toString(arr));

        // Array of objects

        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(str));
        change(str);
        System.out.println(Arrays.toString(str)); // it show that the object has been changed
        // String are immutable in java while array(objects) are mutable in java
    }

    static void change(String[] somestr){
        somestr[2] = "This is changed";

    }
}
