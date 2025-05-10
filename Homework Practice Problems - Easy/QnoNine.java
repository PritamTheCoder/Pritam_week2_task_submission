// Positive, Negative or Zero Write a Java program that takes a number and prints whether the number is positive, negative, or zero.
import java.util.Scanner;
public class QnoNine{
public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    System.out.println("Enter the number:");
    int number = num.nextInt();
    if ( number > 0){
        System.out.println("The number "+ number + " is Positive. ");
    }else if(number < 0){
        System.out.println("The number "+ number + " is Negative. ");
    }else{
        System.out.println("The number "+ number + " is Zero.");
    }
    num.close();
}
}