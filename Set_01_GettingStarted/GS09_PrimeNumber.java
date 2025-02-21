// 9. Prime number
package Set_01_GettingStarted;

import java.util.Scanner;

public class GS09_PrimeNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        
        for (int i = 2; i < num; i++) {
            if (num % i ==0){
                isPrime =false;
                break;
            } 
        }

        System.out.println(isPrime==true?"is Prime":"is not Prime");
    }
}
