// 1. Positive or Negative number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS01_PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to be checked ==> ");
        int n = sc.nextInt();

        System.out.println(n == 0 ? "Zero" : n > 0 ? "Positive number" : "Negetive number");
    }
}