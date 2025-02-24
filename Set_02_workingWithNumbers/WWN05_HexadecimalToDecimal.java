// Hexadecimal to Decimal Conversion
// Converts a hexadecimal number (base 16) into a decimal number (base 10).
package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN05_HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hexadecimal Number : ");
        String hexString =sc.nextLine();

        if (isHex(hexString.strip())) {
            System.out.println(hexToDecimal(hexString.strip()));
        }else{
            System.out.println(hexString+" is not a HEX value");
        }

        sc.close();

    }

    public static boolean isHex(String hexString) {
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            if (!((ch >= '0' && ch <= '9') || ch >= 'A' && ch <= 'F' || ch >= 'a' && ch <= 'f')) {
                return false;
            }
        }

        return true;
    }

    public static int hexToDecimal(String hexString) {
        int decimalValue = 0;
        int[] hexValuesArray = new int[hexString.length()];
        for (int i = 0; i < hexString.length(); i++) {
            char ch = hexString.charAt(i);
            // A-Z:65-90, a-z:97-122, 0-9:48-57

            if (ch >= 'A' && ch <= 'F') {
                hexValuesArray[i] = (ch - 65) + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                hexValuesArray[i] = (ch - 97) + 10;
            } else if (ch >= '0' && ch <= '9') {
                hexValuesArray[i] = (ch - 48);
            }
        }

        int baseValue = hexValuesArray.length - 1;

        for (int j = 0; j < hexValuesArray.length; j++) {
            decimalValue = decimalValue + (hexValuesArray[j] * (int) (Math.pow(16, baseValue)));

            baseValue--;
        }

        return decimalValue;
    }

}
