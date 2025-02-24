/* 14. Armstrong number 
An Armstrong number (also called a narcissistic number, pluperfect digital invariant (PPDI), or number of order n)
is a number where the sum of its digits, each raised to the power of the number of digits, equals the number itself.
153 = 1^3+5^3+3^3 =1+125+27=153
*/

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS14_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        int power = countDigit(num);
        int temp = num;
        int numSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            ;
            numSum = (int) (numSum + Math.pow(digit, power));
            temp /= 10;
        }

        System.out.println(numSum == num);
        sc.close();

    }

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}