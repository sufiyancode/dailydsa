import java.sql.Array;
import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(arr));
        rotateArr(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
    static void rotateArr(int[] nums, int k){

        int length = nums.length;
        int[] temp = new int [length];
        int d=k;
        for (int i = d; i < length; i++) {
                temp[i-d] = nums[i];
        }
        int index = length - d;
        for (int i = 0; i < d; i++) {

              temp[index] = nums[i];
              index++;
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }

    }
}
