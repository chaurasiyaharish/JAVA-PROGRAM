//for traking user input we will use labrary
// class Scanner, witch is comming from package
// java.util
//to add this class in our program, we will use import
//statement, import statement are placed above class
//declearation
import java.util.Scanner;
class UserInputOutput{
    public static void main(String[] args){
        //stap3
        //stape 4 Scanner class  object declear and initialize
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
       //next()
         scanner.nextLine();
       System.out.println("Enter you age");
       byte age = scanner.nextByte();
       
       System.out.println("enter you Mobile Number:");
       double number = scanner.nextDouble();
   //
       System.out.println("Your Detailes:");
       System.out.println("Nmae: "+ name);
       System.out.println("Age: "+age);
       System.out.println("Mobile:"+number);

    }

}