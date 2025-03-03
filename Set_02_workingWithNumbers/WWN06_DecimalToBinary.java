// Decimal to Binary Conversion
// Converts a decimal number (base 10) into a binary number (base 2).
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN06_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number =>");
        int decimalNumber = scanner.nextInt();
        long numCopy = decimalNumber;
        long binaryNumber = 0;

        while (numCopy > 0) {
            binaryNumber *= 10;
            int binDigit = (int) numCopy % 2;
            binaryNumber += binDigit;
            numCopy /= 2;

        }

        System.out.println("DECIMAL [ " + decimalNumber + " ] = BINARY [ " + binaryNumber + " ] ");
    }
}