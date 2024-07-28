// Q-2  Write a program that accept two numbers from the user and print equals
//      if the numbers are equal.

import java.util.Scanner;
public class EqualNumber{
       public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter first number");
       int num1 = scanner.nextInt();

        System.out.println("Enter secod number");
       int num2 = scanner.nextInt();
       if(num1 == num2){
        System.out.println("This number is equal:");

       }
    //    else{
    //     System.out.println("This number is not equal");
    //    }
       }
}