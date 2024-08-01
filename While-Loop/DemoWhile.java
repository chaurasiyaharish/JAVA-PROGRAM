// 
import java.util.Scanner;
class DemoWhile{
      public static void main(String[] args){
    
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter an enterger number:");
      int number = scanner.nextInt();
      System.out.println("Number:"+ number);
      int digitCount = 0;
      while(number>0){
        number = number/10;
        digitCount++;
      } 
      System.out.println("DigitCount:"+ digitCount);
      }

}