
// Q-1  WAP to accept two floatin point numbers froms the user .and
//    perform multiplication and division on the number . display the result  on console.

import java.util.Scanner;
class taskA{
     public static void main(String[] args){
     float num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enteer first number:");
     num1 = sc.nextFloat();
       System.out.println("Enteer Second number:");
     num2 = sc.nextFloat();
     System.out.println("Multiplication of two number:" +(num1*num2));
    //   System.out.println("Division of two number:" +(num1/num2));
     }

}