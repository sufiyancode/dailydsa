import java.util.Scanner;


public class Sum {
    public static void main(String[] args) {
        int sum = sumkaro();
        System.out.println("The sum is: "+ sum);

    }

    static int sumkaro(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();

        //        System.out.println("The sum is: "+ sum);
        return num1 + num2;

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: "+ sum);

    }
}
