//chaeck prime number
public class PrimeNumber{
    public static void main(String[] args) {
        // WAP to check whether the given number is prime number
        int count=0,i;
        for ( i = 1; i <= 100; i++) {
            count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
       // System.out.println("total prime number"+ count);
    }
}
