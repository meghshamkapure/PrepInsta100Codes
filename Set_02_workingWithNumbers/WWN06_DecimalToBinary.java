package Set_02_workingWithNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WWN06_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int decimalValue = sc.nextInt();

        ArrayList<Integer> binaryNumberAL = new ArrayList<>();

        while (decimalValue > 0) {
            binaryNumberAL.add(decimalValue % 2);
            decimalValue = decimalValue / 2;
        }

        // Reverse the list to get the correct binary order
        Collections.reverse(binaryNumberAL);
        
        // Print the binary representation
        System.out.print("Binary representation: ");
        for (int bit : binaryNumberAL) {
            System.out.print(bit);
        }
        System.out.println(); // New line for better formatting

        // Alternative method: Store binary as a String
        StringBuilder binaryString = new StringBuilder();
        for (int bit : binaryNumberAL) {
            binaryString.append(bit);
        }

        System.out.println("Binary as a string: " + binaryString);

        sc.close();
    }
}
