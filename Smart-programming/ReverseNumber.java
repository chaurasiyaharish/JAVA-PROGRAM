// WAP to find the reverse number of any number
import java.sql.SQLOutput;
import java.util.Scanner;
public class ReverseNumber {
   
       public static void main(String[] args) {
        int number,reverse=0, remender;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        number = scanner.nextInt();

        while(number !=0)
        {
            remender = number % 10;
            reverse = reverse*10+remender;
            number = number/10;
        }
        System.out.println( "Reverse number is :");
        System.out.println(reverse);
       }
}
