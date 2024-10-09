public class SearchSort {
    public static void main(String[] args) {
        int[] flatu  = {1, 3, 4, 5, 6};
        int index =  linearsearch(flatu, 5);
            System.out.println(index);




    }
    static int linearsearch(int[] arr, int a){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==a){
                System.out.println("The element "+ a + " is at index " + index);
                return index;
            }

        }
        System.out.println("Element no found");
        return -1;
    }
}
