// Q-1 Write a program in java to swap two number with using third variable
// class SwapNumber{
//       public static void main(String[] args){
      
//       int a = 10, b = 20 ;
//       int t;
//       t = a;
//       a = b;
//       b = t;
//       System.out.println("Enter value of A:"+ a);
//       System.out.println("Enter value of B:"+ b);

//       }

// }

//Q-2  WAP in java to swap two number without using third variable

// class SwapNumber{
//       public static void main(String[] args){
      
//       int a = 10, b = 20 ;
//       a = a+b;  //10+20 = 30
//       b = a-b;  // 30-20=10
//       a = a-b;  // 30-10=20
//       System.out.println("Enter value of A:"+ a);
//       System.out.println("Enter value of B:"+ b);

//       }

// }

// Q-3 WAP in java to accept two number and swap them without using third variable

// import java.util.Scanner;
// class SwapNumber{
//       public static void main(String[] args){
      
//       Scanner scanner = new Scanner(System.in);
     
//       System.out.println("Enter value of A");
//       int A = scanner.nextInt();

//       System.out.println("Enter value of B");
//       int B = scanner.nextInt();

//       A = A+B;  //10+20 = 30
//       B = A-B;  // 30-20=10
//       A = A-B;  // 30-10=20
      
//       System.out.println("After Swapping :");
//       System.out.println("Enter value of A:"+ A);
//       System.out.println("Enter value of B:"+ B);

//       }

// }

//Q-4  WAP in java to accept four number and swap them without using third variable

import java.util.Scanner;
class SwapNumber{
      public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
     
      System.out.println("Enter value of A");
      int A = scanner.nextInt();

      System.out.println("Enter value of B");
      int B = scanner.nextInt();
      System.out.println("Enter value of C");
      int C = scanner.nextInt();

      System.out.println("Enter value of D");
      int D = scanner.nextInt();
      // swap a and b
      A = A+B; 
      B = A-B;  
      A = A-B;  
      //swap b and c 
      C = C+D;
      D = C-D;
      C = C-D;
      // SWAP a and c 
      A = A+C;
      C = A-C;
      A = A-C;
      // swap b and d
      B = B+D;
      D = B-D;
      B = B-D;

      
      System.out.println("After Swapping :");
      System.out.println("Enter value of A:"+ A);
      System.out.println("Enter value of B:"+ B);
      System.out.println("Enter value of A:"+ C);
      System.out.println("Enter value of B:"+ D);
      }

}