// 15. Armstrong number in a given range

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS15_ArmstrongNumberInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start : ");
        int start = sc.nextInt();
        System.out.print("Enter end : ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.print(armstrongNumber(i)?i+" ":"");
        }

        sc.close();

    }

    static boolean armstrongNumber(int num) {
        int power = countDigit(num);
        int temp = num;
        int numSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            ;
            numSum = (int) (numSum + Math.pow(digit, power));
            temp /= 10;
        }

        return numSum == num;
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
