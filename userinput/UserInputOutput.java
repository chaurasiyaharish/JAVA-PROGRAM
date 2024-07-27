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
        int number1;
        double number2;
        //stape 4 Scanner class  object declear and initialize
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
       //next()
       //nextLine();
       System.out.println("name =" + name);
       
       System.out.println("enter age" + age);
       int age = scanner.nextInt();
   //

    }

}