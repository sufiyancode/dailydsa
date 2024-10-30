package switchcase;

import java.util.Scanner;

public class Firstcase {
    public static void main(String[] args) {


    Scanner fruit = new Scanner(System.in);
    String fruits = fruit.next();

        switch (fruits) {
            case "Mango" -> System.out.println("This is your " + fruits);
            case "Orange" -> System.out.println("This is your " + fruits);
            case "Grapes" -> System.out.println("This is your " + fruits);
            case "Apple" -> System.out.println("This is your " + fruits);
            case "Banana" -> System.out.println("This is your " + fruits);
            case "Kiwi" -> System.out.println("This is your " + fruits);
        }
    }
}
