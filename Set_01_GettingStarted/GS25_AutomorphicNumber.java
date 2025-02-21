// 25. Automorphic number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS25_AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int squareValue = square(num);
        int digitCount = countDigit(num);
        int extractDigit = extractDigit(squareValue, digitCount);

        if (extractDigit == num)
            System.out.println("Automorphic number ");
        else
            System.out.println("Not Automorphic number ");

    }

    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int extractDigit(int num, int extractCount) {
        int extractedValue = 0;
        int digitCount = 0;
        while (digitCount < extractCount) {
            int digit = num % 10;
            for (int i = 0; i<digitCount; i++){
                digit*=10;
            }
            extractedValue+=digit;
            num = num / 10;
            digitCount++;
        }
        return extractedValue;
    }
}
