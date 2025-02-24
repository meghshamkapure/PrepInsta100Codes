// 18. Factorial of a number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS18_FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt() ;

        int factorial = 1;

        int i = 1;

        while (i<=number) {
            factorial = factorial *i;
            i++;
        }

        System.out.println(factorial);
        sc.close();

    }
    
}
