// Comparison using if-else Write a Java program that takes two numbers and prints the greater number.
import java.util.Scanner;
public class QnoSix{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = input.nextInt();
System.out.println("Enter the second number: ");
int b = input.nextInt();
if ( a>b){
    System.out.println( a + " is greater than " + b  );
} else {
    System.out.println(  b + " is greater than " + a );
}
input.close();
    }
}