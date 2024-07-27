// Q-1  WAP to find the larger of two number

// class TwoLarger{
//        public static void main(String[] args){

//        int n1=20, n2=40;
//        if(n1>n2)
//        {
//          System.out.println("n1 is larger");
//        }
//        else
//        {
//         System.out.println("n2 is larger");
//        }
    
//      }

// }


// Q-2 WAP to accept the two number from the user and find the larger number between two number.
import java.util.Scanner;
class TwoLarger{
       public static void main(String[] args){

       Scanner hk = new Scanner(System.in);

       System.out.println("Enter First number");
       int n1 = hk.nextInt();
       System.out.println("Enter second number");
       int n2 = hk.nextInt();

       if(n1>n2)
       {
         System.out.println("Larger number is: " + n1);
       }
       else
       {
        System.out.println("Larger number is: " + n2);
       }
    
     }

}