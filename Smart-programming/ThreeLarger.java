// Q-1  WAP to accept the three number from the user and find the larger number between three number.

import java.util.Scanner;
class ThreeLarger{
    public static void main(String[] args){
     
    Scanner hk = new Scanner(System.in);

    System.out.println("Enter first number");
    int n1 = hk.nextInt();

    System.out.println("Enter second number");
    int n2 = hk.nextInt();

    System.out.println("Enter Third number");
    int n3 = hk.nextInt();

    if(n1>n2 && n1>n3)
    {
        System.out.println("The larger number is: " + n1);
    }
    else if(n2>n3 && n2>n1)
    {
        System.out.println("The larger number is: " + n2);
    }
    else{ 
        System.out.println("The larger number is: " + n3);
    }
    
    }
}