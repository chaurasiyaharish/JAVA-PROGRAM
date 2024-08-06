
// WAP to accept two integer from user and print multiplication of numbers
// if the entered numbers are positive and number1 is odd and number2 is even 
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first enteger value:");
    int number1 = scanner.nextInt();

    System.out.println("Enter second enteger value:");
    int number2 = scanner.nextInt();

    System.out.println("Multiplication of two Number: "+ (number1*number2));
    
    if(number1>0 && number2>0)
    {
        if(number1%2!=0)
        {
            System.out.println(number1+" This number is odd");
        }
        if(number2%2==0)
        {
            System.out.println(number2+" This number is even");
        }
    }
    }
}
