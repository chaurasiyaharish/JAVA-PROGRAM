/* Q-1 WAJP to get a number from the user and print whether
 it is positive or negative. */

 import java.util.Scanner;
 class ExerciseA{
       public static void main(String[] args){
      
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter any number: ");
       int Input = scanner.nextInt();
       if(Input > 0){
        System.out.println("This number is positive: "+ Input);
       }
       else if(Input < 0){
        System.out.println("This number is negative: "+ Input);
       }
       else{
        System.out.println("Invalid Input");
       }

       }

 }

/* Q-2 WAJP */