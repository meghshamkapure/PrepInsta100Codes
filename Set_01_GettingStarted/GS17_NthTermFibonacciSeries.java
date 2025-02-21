// 17. Find the Nth Term of the Fibonacci Series

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS17_NthTermFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int nthTerm = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        if (nthTerm <= 0) {
            System.out.println(nthTerm + " is invalid");
        } else if (nthTerm == 1) {
            sum = n1;
        }else if (nthTerm == 2) {
            sum = n2;
        } else {
            for (int i = 3; i <= nthTerm; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
        }

        System.out.println(nthTerm+"th Fibonacee series number is "+sum);
    }
}
