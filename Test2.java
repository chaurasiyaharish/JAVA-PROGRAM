// WAP to print you name and ask user to enter an enteger value, check if value is divisible by 5,
// if yes print your email otherwise print no contact information available
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter any enteger value");
        number =scanner.nextInt();
        if(number%5==0)
        {
          System.out.println("your eamil id: chaurasiyah348@gamil.com ");
          //int email = scanner.nextInt();
        //  System.out.println("your email is: "+ email);
        }
        else{
            System.out.println("no contct information available");
        }
        
    }
}

