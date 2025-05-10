// Simple Calculator (if-else) Write a Java program that asks the user to enter two numbers and an operator 
// (+, -, *, /) and then calculates the result based on the operator using if-else statements.
import java.util.Scanner;
public class QnoEight{
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = input.nextInt();
    System.out.println("Enter the second number: ");
    int b = input.nextInt();
    input.nextLine();
    System.out.println("Enter the operation: (+,-,*,/)");
    String operation = input.nextLine();
    {
    if( operation.equals( "+")){
        System.out.println("The sum of" + a + "+" + b + "=" + (a+b));
    } else if( operation.equals("-")){
        System.out.println("The substraction of " + a + "+" + b + "=" + (a-b));
    } else if ( operation.equals("*")){
        System.out.println("The multiplication of"+ a + "+" + b + "="+ (a * b));
    }else if( operation.equals("/")){
        if( b <= 0){
            System.out.println("Division by zero is not possible.");
        }else{
            System.out.println("The division of"+ a + "/" + b + "="+ ((double) a/b));
        }
    }
}
input.close();
}}