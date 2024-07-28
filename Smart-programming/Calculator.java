// Q-1  WAP to creat Calculator using switch case in java 
// import java.util.Scanner;
// class Calculator{
//     public static void main(String[] args){
     
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Enter first No:");
//     int no1 = scanner.nextInt();

//     System.out.println("Enter second No:");
//     int no2 = scanner.nextInt();

//     System.out.println("Select symbol(+,-,*,/)");
//     String symbol = scanner.next();
//    // int result;
//      switch(symbol){
//         case "+":{
//            // result = no1+no2;
//             System.out.println("Addition is:"+ (no1+no2));
//             break;
//         }
//         case "-":{
//            // result = no1+no2;
//             System.out.println("Subtration is:"+ (no1-no2));
//             break;
//         }

//         case "*":{
//            // result = no1+no2;
//             System.out.println("Multiplecation is:"+ (no1*no2));
//             break;
//         }
//         case "/":{
//             //result = no1+no2;
//             System.out.println("Division is:"+ (no1/no2));
//             break;
//         }
//         default:
//         {
//           System.out.println("Invalid symbol");
//         }
//      }
//     }

// }

// Q-2

import java.util.Scanner;
class Calculator{
      public static void main(String[] args){
      String yn;
       do{
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter first No:");
         int no1 = scanner.nextInt();

         System.out.println("Enter second No:");
         int no2 = scanner.nextInt();

         System.out.println("Select symbol(+,-,*,/)");
         String symbol = scanner.next();
         // int result;
          switch(symbol){
            case "+":{
               // result = no1+no2;
                System.out.println("Addition is:"+ (no1+no2));
                break;
            }
            case "-":{
               // result = no1+no2;
            System.out.println("Subtration is:"+ (no1-no2));
            break;
            }

            case "*":{
               // result = no1+no2;
                System.out.println("Multiplecation is:"+ (no1*no2));
                break;
            }
            case "/":{
                //result = no1+no2;
                System.out.println("Division is:"+ (no1/no2));
                break;
            }
            default:
            {
              System.out.println("Invalid symbol");
            }
          }
            System.out.println("Do you want to continue(press y for Yes and n for No)");
            yn = scanner.next();
           }while(yn .equals("Y") || yn .equals("y"));
         
    }
     
  }