// 13. Palindrome number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS13_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = sc.nextInt();

        int numCopy = num ; 

        int reversedNum = 0;
        while (numCopy > 0) {               
            reversedNum *= 10;
            int digit = numCopy % 10;
            reversedNum += digit;       
            numCopy /= 10;                     
        }
        System.out.println(reversedNum);
        System.out.println(num==reversedNum?"is Palindrome": "is not palindrome");
        sc.close();

    }
}
