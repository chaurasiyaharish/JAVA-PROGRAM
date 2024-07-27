//WAP to sum all the enterd value

import java.util.Scanner;
// WAP to accept  cercomfrance of circle from the user and print the redius of circle

class PreticA{
      public static void main(String[] args){
      
      Scanner Scanner = new Scanner(System.in);
      System.out.println("Enter cercomfrance of circle");
      int cercomfrance  = Scanner.nextInt();
         double result = cercomfrance/(2*3.14);
      System.out.println("Radious of circle :"+ result);

      }

}