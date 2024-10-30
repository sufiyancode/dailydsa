import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPrime(num);
    }
    static void isPrime(int a){
        if(a<=1){
            System.out.println("The number should be greater than 1");
            return;
        }

        for(int i=2; i<=Math.sqrt(a); i++ ){
            if(a%i == 0){
                System.out.println("This is not a prime no.");
                return;
            }
        }

        System.out.println("The number is prime");
    }
}
