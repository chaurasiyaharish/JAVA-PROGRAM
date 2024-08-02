import java.util.Scanner;
class DemoSwitch{
    public static void main(String[] args){
    //finding whether the given mnth is having 31  or 30 or 29 days
    System.out.println("select the month from given the list");
    System.out.println("1--> january");
    System.out.println("2--> February");
    System.out.println("3--> march");
    System.out.println("4--> april");
    System.out.println("5--> may");
    System.out.println("6--> june");
    System.out.println("7--> july");
    System.out.println("8--> august");
    System.out.println("9--> september");
    System.out.println("10--> actoober");
    System.out.println("12--> november");
    System.out.println("13--> december");

    java.util.Scanner scanner = new Scanner(System.in);

    int month = scanner.nextInt();
    switch (month){
        case 1:
            System.out.println("31 days");
            break;
        case 2:
            System.out.println("28 or 29 days, based on leep year");
            break;
         case 3:
            System.out.println("31 days");
            break;
        case 4:
            System.out.println("30 days");
            break;
        case 5:
            System.out.println("31 days");
        case 6:
            System.out.println("30 days");
        case 7:
            System.out.println("31 days");
            break;
        case 8:
            System.out.println("31 days");
            break;
        case 9:
            System.out.println("30 days");
        case 10:
            System.out.println("31 days");
        case 11:
            System.out.println("30 days");
        case 12:
            System.out.println("31 days");
        default:
            System.out.println("invalid");
    }
     

    }
}