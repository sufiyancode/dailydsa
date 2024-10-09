import java.util.Arrays;

public class SearchMin {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, -98, 9, -17, -19, -31};
        System.out.println(min(arr));
        }

    static int min(int[] arr){
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
