// 7. Greatest of the Three numbers
package Set_01_GettingStarted;

import java.util.Scanner;

public class GS07_GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("All three number are equal");
        } else if (n1 == n2) {
            if (n1 > n3)
                System.out.println("n1 and n2 are greter than n3");
            else
                System.out.println("n3 is greater than n1 and n2");
        } else if (n2 == n3) {
            if (n2 > n1) {
                System.out.println("n2 and n3 are greater than n2");
            }
            System.out.println("n2 and n3 are greater than n1");
        } else if (n1 == n3) {
            if (n1 > n2) {
                System.out.println("n1 and n2 is greater than n3");
            } else {
                System.out.println("n3 is greater than n1 and n2");
            }
            System.out.println("n1 and n3 are greater than n2");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("n3 is gretest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is greatest");
        } else if (n3 > n1 && n1 > n3) {
            System.out.println("n3 is gretest");
        }
        sc.close();

    }
}
