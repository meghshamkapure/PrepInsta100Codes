// Binary to Octal Conversion
// Converts a binary number (base 2) into an octal number (base 8).
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN09_BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number : ");
        long binaryNumber = sc.nextLong();
        long binaryNumberCopy = binaryNumber;
        String octalNumber = "";

        if (isBinary(binaryNumber)) {
            while (binaryNumber > 0) {
                long digit = binaryNumber % 1000;
                octalNumber = toBinary(toBinary(digit)) + octalNumber;
                binaryNumber /= 1000;
            }

            System.out.println("BINARY [" + binaryNumberCopy + "] : OCTAL [" + octalNumber + "]");
        } else {
            System.out.println("INVALID BINARY NUMBER !!!");
        }

    }

    public static long toBinary(long number) {
        int decimal = 0;
        int i = 0;
        while (number > 0) {
            decimal += (number % 10) * Math.pow(2, i++);
            number /= 10;
        }
        return decimal;
    }

    public static boolean isBinary(long number) {
        while (number > 0) {
            long digit = number % 10;
            if (digit != 0 && digit != 1) {
                return false;
            }

            number /= 10;

        }
        return true;
    }
}
