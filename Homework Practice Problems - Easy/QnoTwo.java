import java.util.Scanner;

public class QnoTwo {
    public static void main(String[] args){  
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first number: \n");
int num1 = scanner.nextInt();
System.out.println("Enter the second number: \n");
int num2 = scanner.nextInt();

int sum = num1 + num2 ;
System.out.println("The sum is " +sum);
int sub = num1 - num2;
System.out.println("The sub is " +sub);
int mul = num1 * num2;
System.out.println("The multiplication is" +mul);
double div = (double) num1 /num2;
if(num2 == 0){
    System.out.println("This mathematical division is invalid.");
}else{
   System.out.println("The division is" +div);
}
scanner.close();
}}
