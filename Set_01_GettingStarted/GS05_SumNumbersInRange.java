// 5. Sum of numbers in a given range

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS05_SumNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("From number ==> ");
        int start = sc.nextInt();
        System.out.print("To number ==> ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum of digits betwwen " + start + " to " + end + " is " + sum);
        sc.close();


    }
}
