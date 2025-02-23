// Binary to Decimal Conversion
// Converts a binary number (base 2) into a decimal number (base 10).

package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN03_BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binaryNumber = sc.nextInt();
        int binaryCopy = binaryNumber;
        int base = 1;
        int decimalNumber = 0;

        if (isBinary(binaryCopy)) {
            while (binaryNumber > 0) {
                int digit = binaryNumber % 10;
                digit *= base;
                decimalNumber += digit;
                base *= 2;
                binaryNumber /= 10;
            }

            System.out.println("BINARY : " + binaryCopy + " is " + "DECIMAL : " + decimalNumber);
        }else{
            System.out.println("The number is binary");
        }

    }

    public static boolean isBinary(int num) {

        while (num > 0) {
            int digit = num % 10;
            if (digit > 1)
                return false;

            num /= 10;
        }

        return true;
    }

}
