import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, -17, -19, -31};
        int target = 15;
        System.out.println(Arrays.stream(arr).min());
        System.out.println(linearsearch(arr, target, 4, 9));
    }
    static int linearsearch(int[] arr, int target, int start, int end){
        if(arr.length ==0){
            return Integer.MIN_VALUE;
        }
        for (int i = start; i < end; i++) {
            if(arr[i] == target){
                return target;
            }

        }
        return Integer.MIN_VALUE;
    }
}
