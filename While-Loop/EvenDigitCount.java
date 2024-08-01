//count the even digit in the number given by user
import java.util.Scanner;
class EvenDigitCount{
      
      public static void main(String[] args){
     
      Scanner scanner = new Scanner(System.in);

      System.out.println("enter any number");
      int number1 = scanner.nextInt();

      int digitCount=0;
      while(number1 != 0)
      {
        number1 = number1 % 10;
        if(number1%2==0){

           digitCount++;
        }
        
      }
    System.out.println("This number is even"+ number1);
    System.out.println("digitcount" + digitCount);
      }

}