// WAP to display the student datails using scanner class 

import java.util.Scanner;
class StudentData{
      public static void main(String[] args){
      
      Scanner s = new Scanner(System.in);

      System.out.println("Student Name : ");
      String name = s.next();

      System.out.println("Student roll number : ");
      int roolNumber = s.nextInt();
                       s.nextLine();
      System.out.println("Student Email ID : ");
      String email = s.next();


      System.out.println("Student Section : ");
      String section = s.next();
                       s.nextLine();

      System.out.println("Student Detail:..................");
      System.out.println("Name : " + name );
      System.out.println("Rool Number : " + roolNumber );
      System.out.println("Email ID : " + email );
      System.out.println("Section : " + section );

      }
   
}