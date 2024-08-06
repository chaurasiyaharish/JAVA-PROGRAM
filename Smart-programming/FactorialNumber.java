//WAP to find the Factorial of any number
import java.util.Scanner;
public class FactorialNumber {
   
    public static void main(String[] args) {

        long number,Factorial=1,i; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        number = scanner.nextLong();

        for(i=number ;i>=1;i--)
        {
            Factorial=Factorial*i;
        }
        System.out.println("Factorial of "+number+" is "+Factorial);
       }
}
