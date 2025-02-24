// 6. Greatest of two numbers

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS06_GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Equal number");
        } else {
            if (n1 > n2)
                System.out.println(n1 + " is the greatest");
            else
                System.out.println(n2 + " is the greatest");

        }

        sc.close();


    }
}
