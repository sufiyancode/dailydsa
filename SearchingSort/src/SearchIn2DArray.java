import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 33, 44, 55, 66},
                {23, 43, 53, 63, 64, 89},
                {12, 23 ,34 ,45 ,56, 5},
                {121, 142, 1433, 54, 567}
        };
        int target = 142;
        int[] answer = searchIn2d(arr, target);
        int answer2 = max(arr);
        System.out.println(answer2);
        System.out.println(Arrays.toString(answer));
    }

    static int[] searchIn2d(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int ans = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > ans) {
                    ans = anInt;
                }
            }
        }
        return ans;
    }
    static int min(int[][] arr){
        int ans = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]< ans){
                    ans=arr[row][col];
                }
            }
        }
        return ans;
    }
}
