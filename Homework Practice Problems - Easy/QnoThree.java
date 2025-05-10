import java.util.Scanner;
public class QnoThree{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Program to check even or odd
    System.out.println("Enter the number:");
    int num = scanner.nextInt();

    if( num % 2 == 0){
        System.out.println("The number is Even. ");
    }else{
        System.out.println("The number is Odd.");
    }
    scanner.close();
}}