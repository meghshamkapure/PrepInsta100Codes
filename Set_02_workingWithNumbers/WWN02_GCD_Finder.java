// Greatest Common Divisor (GCD)
// Finds the largest number that evenly divides two or more numbers (same as HCF).
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN02_GCD_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();

        System.out.print("Greatest Common Divisor (GCD)  of " + num1 + " and " + num2 + " is ");
        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int gcd = 1;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.print(gcd);
        sc.close();

    }
}
