/*
Q-1 WAPin java to find the even or odd number 
*/ 
// class FindEvenOdd{
//     public static void main(String[] args){

//     int number = 24;
//     if(number%2 == 0){
//         System.out.println("Even numberr is: "+ number);
//     }
//     else{
//         System.out.println("Odd number is: "+ number);
//     }
//     }
// }


//Q-2 WAP in java to accept the any nubmer from the user and find the even or odd these number
import java.util.Scanner;

class FindEvenOdd{
    public static void main(String[] args){
     
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter any number:");
    int number = scanner.nextInt();

    if(number%2 == 0){
        System.out.println(number + " is Even number");
    }
    else{
        System.out.println(number+" is Odd number");
    }
    }
}