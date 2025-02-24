// Octal to Decimal Conversion
// Converts an octal number (base 8) into a decimal number (base 10).

package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN04_OctalToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a octal valued number : ");
        int num = sc.nextInt();
        int numcopy = num;
        int decimalNUmber  = 0 ;
        int base = 0 ;
        if (isOctal(num)) {
            while (num > 0) {
                decimalNUmber = decimalNUmber + ((num % 10) * ((int) Math.pow(8,base++)));
                num/=10;
            }
            System.out.println("Octal : ("+numcopy+")\t==>\tDecimal : ("+decimalNUmber+")");

        }else{

        System.out.println(numcopy+" is not OCTAL");
        }

        sc.close();

    }

    public static boolean isOctal(int number) {
        while (number > 0) {
            if ((number % 10) > 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}