//  Octal to Binary Conversion  
//  Converts an octal number (base 8) into a binary number (base 2)

package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN10_OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter OCtal Number : ");
        int octalNumber = sc.nextInt();
        int numCopy = octalNumber;
        String binaryNumber = "";

        if (isOctal(numCopy)) {
            while (numCopy > 0) {
                int digit = numCopy % 10;
                binaryNumber = toBinary(digit) + " " + binaryNumber;
                numCopy /= 10;
            }
            System.out.println(" OCTAL [" + octalNumber + "] : BINARY [" + binaryNumber + "]");

            System.out.println();
        } else {
            System.out.println("INVALID OCTAL NUNBER !!!");
        }

    }

    public static boolean isOctal(int num) {
        while (num > 0) {
            if (num % 10 >= 8)
                return false;

            num /= 10;
        }
        return true;
    }

    public static String toBinary(int num) {
        int i = 1;
        int binarynNumber = 0;
        while (num > 0) {
            int digit = (num % 2) * i;
            binarynNumber = binarynNumber + digit;
            i *= 10;
            num /= 2;
        }

        if (binarynNumber < 10) {
            return "00" + binarynNumber;
        } else if (binarynNumber < 100) {
            return "0" + binarynNumber;
        } else {
            return "" + binarynNumber;
        }

    }
}
