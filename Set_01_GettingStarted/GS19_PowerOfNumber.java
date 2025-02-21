// 19. Power of a number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS19_PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent : ");
        int exponent = sc.nextInt();

        int value = 1;
        for (int i = 0; i < exponent; i++) {
            value = value * base;
        }

        System.out.println("Base "+base +" Power "+exponent+" is equals to "+ value);
    }
}
