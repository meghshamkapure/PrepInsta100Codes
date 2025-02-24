// 21. Finding Prime Factors of a number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS21_PrimeFactorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        System.out.print("Prime Factors of "+ number+" are : ");
        int divisor = 2;
        while (number>1) {
            if (number % divisor ==0){
                System.out.print("\t"+divisor);
                number = number / divisor;
            }  else{
                divisor++;
            }
        }

        sc.close();

    }    
}
