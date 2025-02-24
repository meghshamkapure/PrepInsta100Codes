// 22. Strong number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS22_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt() ;

        int temp = number;

        int factorialSum = 0;
        while (temp>0) {
            factorialSum += factorial(temp%10); 
            temp/=10;
        }

        System.out.print(factorialSum == number?"Strong Number":"Not Strong Number");
        sc.close();

    }

    public static int factorial (int number){
        int factorial = 1;
        int i = 1;

        while (i<=number) {
            factorial = factorial *i;
            i++;
        }
        return factorial;
    }
}