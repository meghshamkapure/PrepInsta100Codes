// 12. Reverse of a number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS12_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked ==> ");
        int n = sc.nextInt();  
        int reversedNum = 0;
        while (n > 0) {               
            reversedNum *= 10;
            int digit = n % 10;
            reversedNum += digit;       
            n /= 10;                     
        }
        System.out.println(reversedNum);
        sc.close();

    }
}
