// 26. Harshad number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS26_HarshadNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if (num % sumOfDigits(num)==0)
            System.out.println("Harshad number ");
        else
            System.out.println("Not Harshad number ");

    }

    public static int sumOfDigits(int number){
        int numberSum = 0 ; 
        while (number>0) {
            numberSum += (number%10); 
            number/=10;
        }
        return numberSum;
    }
    
}
