// Lowest Common Multiple (LCM)
// Finds the smallest number that is a multiple of two or more given numbers.
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN01_LCM_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();

        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = 1;; i++) {
            int divident = num1 * i;

            if (divident % num2 == 0) {
                System.out.println(divident);
                break;
            }
        }

        sc.close();

    }

}
