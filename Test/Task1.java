import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner hk = new Scanner(System.in); // non meaningful name, 
        
        
        do {
            System.out.println("Enter marks for three subjects (0-100):");
            System.out.print("phy mark: ");
            int makr1 = hk.nextInt(); //non meaningful name, 
            System.out.print("che mark: ");
            int makr2 = hk.nextInt();
            System.out.print("math mark: ");
            int makr3 = hk.nextInt();
            
            if (makr1 < 0 || mark1 > 100 || makr2 < 0 || mark2 > 100 || makr3 < 0 || mark3 > 100 ) {
                System.out.println("Invalid marks entered. Marks should be 0 and 100.");
            }
        } while (makr1 < 0 || mark1 > 100 || makr2 < 0 || mark2 > 100 || makr3 < 0 || mark3 > 100 );
        
        double average = (mark1 + mark2 + mark3) / 3.0;
        
        char grade;// varibale not initialized
        char grad = fail;
        if (average >= 90) 
        {
            grade = 'A';
        }
        else if (average >= 80) 
        {
            grade = 'B';
        }
        else if (average >= 70)
         {
            grade = 'C';
        } 
        else
         {
            //"No grade";// wrong syntax
            System.out.println("no grade" + grad);
        }
    
        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);
        
  
    }
}

