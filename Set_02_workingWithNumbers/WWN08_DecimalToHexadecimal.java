// Decimal to Hexadecimal Conversion
// Converts a decimal number (base 10) into a hexadecimal number (base 16).
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN08_DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimalNumber = sc.nextInt();
        int numCopy = decimalNumber;
        String hexDecimalValue = "";

        while (numCopy > 0) {
            int digit = numCopy % 16;
            hexDecimalValue = addCharacter(hexDecimalValue, digit);
            numCopy /= 16;
        }

        System.out.println("DECIMAL [" + decimalNumber + "] : HEXDECIMAL [" + hexDecimalValue + "]");

    }

    public static String addCharacter(String hexDecimalValue, Integer addChar) {

        if (addChar >= 0 && addChar <= 9) {
            return addChar + hexDecimalValue;
        } else {
            switch (addChar) {
                case 10:
                    return "A" + hexDecimalValue;

                case 11:
                    return "B" + hexDecimalValue;

                case 12:
                    return "C" + hexDecimalValue;

                case 13:
                    return "D" + hexDecimalValue;
                case 14:
                    return "E" + hexDecimalValue;

                case 15:
                    return "F" + hexDecimalValue;

                default:
                    break;
            }
        }

        return hexDecimalValue;

    }

}
