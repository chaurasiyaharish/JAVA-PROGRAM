import java.util.Scanner;
class Test{
      public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter phy marks :");
       int mark1 =scanner.nextInt();

       System.out.println("Enter math marks :");
       int mark2 =scanner.nextInt();

       System.out.println("Enter che. marks :");
       int mark3 =scanner.nextInt();

     //   if(mark1 < 0 || mark1 < 101 || mark2 > 0 || mark2 < 101 || mark1 > 0 || mark1 < 101)
           
     //   System.out.println("Student persentage is  :" + mark1+mark2+mark3/3);
     //   double score = hk.nextDouble();
      double score = (mark1+mark2+mark3/3.0);

       if(score >= 90)
       {
            System.out.println("Gred A ");
       }
       else if(score >= 70)
       {
            System.out.println("Gred B ");
       }
       else if(score >= 50)
       {
            System.out.println("Gred C ");
       }
       else{
            System.out.println("Gred D");
       }

      }

}


