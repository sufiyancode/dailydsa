// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNoOfDigit {
    public static void main(String[] args) {
    int[] arr = {73, 32, 234, 342};
    int ans =  findNumbers(arr);
    System.out.println("Count is: "+ ans);
    }
    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums){
            if(isEven(num)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        String nom = num + "";
        if(nom.length() % 2 ==0){
            System.out.println(nom);
            return true;
        }
        return false;
    }

    static boolean isEven(int num){
        int nom = num;
        int count=0;
        while(nom>0){
            count++;
            nom = nom/10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
}
