import java.util.Arrays;
import java.util.Scanner;

public class MultiDimention {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */

//        int[][] arr = new int[3][3];

        int[][] arr = {
                {1, 2 ,3, 4, 5 },
                {4 ,5, 6, 7 ,8},
                {7, 8, 9, 7, 8}
        };




//        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

        int[][] arr2d = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print( arr2d[row][col]+ " ");
            }
            System.out.println();

        }
        System.out.println(Arrays.toString(arr2d[0]));
        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(Arrays.toString(arr2d[2]));
    }
}
