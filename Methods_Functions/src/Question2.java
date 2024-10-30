import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean s = armstrong(n);
//    if(s){
//        System.out.println(n +" is a armstrong number");
//    }
//    else {
//        System.out.println(n +" is not a armstrong number");
//
//    }
        for (int i = 0; i < 1000; i++) {
            if(armstrong(i)){
                System.out.println(i);
            }
        }

    }
    static boolean armstrong(int original){
        int n = original;
        int sum =0;
        while (0 < n) {
            int rem = n % 10;
//            System.out.println(rem);
            sum += rem*rem*rem;
            n = n / 10;

        }
//        System.out.println("The sum is "+ sum);
//        System.out.println("The original is "+ original);
        return sum == original;
    }


}
