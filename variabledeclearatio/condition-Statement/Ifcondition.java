// WAP to accept an number from the user,
//and check if the number is grater then 100,
//if grater, then print the number,
//this code will  always print thank you

import java.util.Scanner;
class Ifcondition{
public static void main(String[] args){
//creating an scanner object  and initilalizing
//it also attaching the input source i.e.
//console import
Scanner scanner = new Scanner(System.in);
//prompting the user
System.out.println("enter an interger");
int number =scanner.nextInt();
//conditional expresion
if(number < 100){
    System.out.println("Number =" + number);
}
   System.out.println("Thank you");
}

}

// wap to check