
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // The first error is in this block
        System.out.println("***** Welcome to simple program *****");
        System.out.println("*\tThis program contains 3 errors\t");

        System.out.println("Please enter a natural number between 1 and 6:");
        // This second error is in this block
        Scanner scanner = new Scanner (System.in);
        int nauralNamber = scanner. nextInt();
        if (nauralNamber < 1 || nauralNamber > 6) {
            System.out.println("Your number is not is the specified range!");}
        else if (nauralNamber == 1 ) {
            System.out.println("Hi, how are you doing?");}
        else if (nauralNamber == 2) {
            // This third error is in the block
            System.out.println("Have a good day!");}
        else if (nauralNamber == 3) {
            System.out.println("You're very good at fixing bugs.");}
        else if (nauralNamber == 4) {
            System.out.println("You will become a good programmer!");}
        else if (nauralNamber == 5) {
            System.out.println("See you soon!");}














    }
}



