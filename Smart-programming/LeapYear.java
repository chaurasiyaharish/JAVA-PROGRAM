// Q-1 WAP in java to check for leap year

// class LeapYear{
//       public static void main(String[] args){

//       int year = 2022;
//       if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
//         System.out.println(year +"  Is leap year");
//       }
//       else{
//         System.out.println(year +" Is not leap year");
//       }
//       }

//}

// Q-2 Write a java prigram to accept any year and check if it is a leap year

import java.util.Scanner;
class LeapYear{
      public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter any year");
      int year = scanner.nextInt();
      if(year>0){
        if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){
        System.out.println(year +" Is leap year");
        }
        else{
        System.out.println(year +" Is not leap year");
        }
      }
      else{
        System.out.println("Invalid year");
      }
    
      }
}