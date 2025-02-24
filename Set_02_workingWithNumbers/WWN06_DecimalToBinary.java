// Decimal to Binary Conversion
// Converts a decimal number (base 10) into a binary number (base 2).

package Set_02_workingWithNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class WWN06_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number : ");
        int decimalValue = sc.nextInt();

        ArrayList <Integer> binaryNumberAL = new ArrayList<>();

        while (decimalValue>0) {
            binaryNumberAL.add(decimalValue%2);
            decimalValue = decimalValue / 2;
            
        }
        System.out.println(binaryNumberAL.reversed());

        Long binayValue=(long) 0;
        for (int i = binaryNumberAL.size()-1 ;i>=0;i--){
            binayValue*=10;
            binayValue+= binaryNumberAL.get(i);
        }

        System.out.println(binayValue);

        sc.close();
        
    }
}
    