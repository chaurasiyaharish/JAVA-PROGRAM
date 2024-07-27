// wap to  ask user to enter the withdrawal amount.
// check if the withdrawal amount is less then balance amount,then print the msg withdrawal permitted.
// and always print tysm.

import java.util.Scanner;
class ifdemo{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the withdrawal amount");
    int withdrawal = scanner.nextInt();
    int balance = 5000;
    if(withdrawal <= balance){
      System.out.println("withdrawal parmitted");
    }
    System.out.println("tysm");
}
}