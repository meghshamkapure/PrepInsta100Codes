// 3. Sum of First N Natural numbers
package Set_01_GettingStarted;

import java.util.Scanner;

public class GS03_SumFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("From 1 to which number the sum should be calculated ? ==> ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of digit from 1 to " + n + " is " + sum);
        sc.close();

    }
}
