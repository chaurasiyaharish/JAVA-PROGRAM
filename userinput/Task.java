/*Q-1  WAP to accept two integer numbers froms the user .and
   perform addition and subtraction. display the result of the
    operation on console.*/

// import java.util.Scanner;
// class Task{
//      public static void main(String[] args){

//      Scanner hk=new Scanner(System.in);

//      System.out.println("Enteer first number:");
//      int n1=hk.nextInt();

//      System.out.println("Enteer Second number:");
//      int n2=hk.nextInt();

//      System.out.println("Sum of two number:" +(n1+n2));
//      }

// }

// Q-2  WAP to accept two floatin point numbers froms the user .and
//    perform multiplication and division on the number . display the result  on console.

// import java.util.Scanner;
// class Task{
//      public static void main(String[] args){
  
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enteer first number:");
//      float num1=sc.nextFloat();

//      System.out.println("Enteer Second number:");
//      float num2=sc.nextFloat();

//      System.out.println("Multiplication of two number:" + (num1*num2));
//      System.out.println("Division of two number:" + (num1/num2));
//      }

// }

//Q-3  Write a program to accept radius of circle from user.
// And calculate area and perimeter of circle. Display the result on console
//area of circle = πr²
//perimeter of circle = 2πr

// import java.util.Scanner;
// class Task{
//      public static void main(String[] args){
  
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enteer any number:");
//      int number=sc.nextInt();
     
//      System.out.println("Area of circle :" + (22/7*number*number));
//      System.out.println("perimeter of circle:" + (2*3.14*number));
//      }

// }

//Q-4 Write a program to accept length and breadth of rectangle from user. 
//    And calculate area and perimeter of rectangle. Display the result on console
//   area of recangle = length × width
//   perimeter of rectangle = 2(length × width) 

// import java.util.Scanner;
// class Task{
//       public static void main(String[] args){
//       Scanner hk=new Scanner(System.in);
     
//       System.out.println("Enter length: ");
//       int length=hk.nextInt();

//       System.out.println("Enter width: ");
//       int width=hk.nextInt();

//       System.out.println("Area of Rectangle : " + (length*width));
//       System.out.println("perimeter of Rectangle : " + (2*length+width) );

//       }
// }

// Q=6 Write a program that reads a Celsius degree in a double value from the console, 
//     then converts it to Fahrenheit and displays the result.
//    fahrenheit = (9 / 5) * celsius + 32
//    To Day ASK 
import java.util.Scanner;
class Task{
      public static void main(String[] args){
      Scanner hk=new Scanner(System.in);
     
      System.out.println("Enter tempreture in Celsius degree : ");
      float celsius=hk.nextFloat();
      

      System.out.println("Tempreture in fahrenheit: " + ((9/5.0) * celsius + 32));
      
      }
}


//Q-7 Write a program that calculates the energy needed to heat water from an initial temperature
//    to a final temperature. Your program should prompt the user to enter the amount of
//     water in kilograms and the initial and final temperatures of the water.

//   The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
//   where M is the weight of water in kilograms temperatures are in degrees Celsius, 
//   and energy Q is measured in joules 

// import java.util.Scanner;
// class Task{
//       public static void main(String[] args){
//       Scanner hk=new Scanner(System.in);
     
//       System.out.println("Enter the amount of water in kilogram : ");
//       double amount=hk.nextDouble();

//       System.out.println("Enter the initial tempreture : ");
//       double initialTemperature =hk.nextDouble();

//       System.out.println("Enter the final tempreture : ");
//       double finalTemperature =hk.nextDouble();

//       System.out.println("The energy needed is " + amount * (finalTemperature-initialTemperature) * 4184);
      
//       }
// }

//Q=8 Write a program that reads the balance and the annual percentage 
//    interest rate and displays the interest for the next month

//     interest = balance x (annualInterestRate/1200)

// import java.util.Scanner;
// class Task{
//       public static void main(String[] args){
//       Scanner hk=new Scanner(System.in);
     
//       System.out.println("Enter Balance : ");
//       int balance=hk.nextInt();

//       System.out.println("Enter the annual percentage interest rate : ");
//       int  =hk.nextDouble();

//       System.out.println("Enter the final tempreture : ");
//       double finalTemperature =hk.nextDouble();

//       System.out.println("The energy needed is " + amount * (finalTemperature-initialTemperature) * 4184);
      
//       }
// }

// Q=9  write a program that accepts Dividend, and 
//      Divisor from the user and print the remainder on the console. 

// import java.util.Scanner;
// class Task{
//       public static void main(String[] args){
//       Scanner hk=new Scanner(System.in);
     
//       System.out.println("Enter first number : ");
//       int n1=hk.nextInt();

//       System.out.println("Enter second number : ");
//       int n2=hk.nextInt();

//       System.out.println("Reminder value of two number = " + (n1%n2));
      
//       }
// }