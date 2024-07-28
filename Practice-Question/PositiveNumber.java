// Q-1 // Write a program that accept an integer form user and print positive,
//        if the integer is positive.
import java.util.Scanner;
public class PositiveNumber{
       public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter any enterger value");
       int num = scanner.nextInt();
       if(num>0){
        System.out.println(num + ":is positive number");
       }
       }
}