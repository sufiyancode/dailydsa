import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    In Java, primitive types (like int, float, etc.) are passed by value,
    meaning a copy of the value is passed to the function, and changes inside the
    function do not affect the original variable.
    However, when you pass an object (such as an array, class instance, etc.),
    the reference to the object is passed by value.
    This means the function gets a copy of the reference (or address) of the object,
    not the object itself, but both the original and the function refer to the same object in memory.
     */
    static void change(int[] nums){
        nums[0] = 99;
        int a =15;
        { // Scope
            int b =14;
        }
    }
}
