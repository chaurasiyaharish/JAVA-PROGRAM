// wap to  ask user to enter the withdrawal amount.
// check if the withdrawal amount is less then balance amount,then print the msg withdrawal permitted other
// and always print tysm.
import java.util.Scanner;
class ifelse{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the withdrawal amount");
    int withdrawal = scanner.nextInt();
    int balance = 5000;
    if(withdrawal <= balance){
      System.out.println("withdrawal parmitted");
    }
    else{
        System.out.println("withdrawal not pernitted");
    }
    // System.out.println("tysm");
}
}