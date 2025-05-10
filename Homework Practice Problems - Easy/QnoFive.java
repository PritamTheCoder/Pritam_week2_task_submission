// Use of Logical Operators Write a Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)
import java.util.Scanner;
public class QnoFive{
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Are you a citizen? (Y/N)");
        String isCitizen = input.nextLine();
        if( age >= 18 && isCitizen.equals("Y")){
            System.out.println("Congratulatons" + name + "!!" + " You are eligible to vote. ");
        } else {
            System.out.println("Sorry!!" + name +" You are not eligible to vote.");
        }
        input.close();
    }
}