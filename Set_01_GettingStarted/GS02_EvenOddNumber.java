// 2. Even or Odd number
package Set_01_GettingStarted;

import java.util.Scanner;

public class GS02_EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to be checked ==> ");
        int n = sc.nextInt();

        System.out.println(n == 0 ? "Zero" : n % 2 == 0 ? "Even number" : "Odd number");
    }

}
