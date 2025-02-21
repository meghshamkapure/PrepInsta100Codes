// 20. Factor of a number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS20_FactorsOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        for (int i = 1; i <=number; i++) {
            if  (number % i==0)
                System.out.print(i+"\t");
        }
    }    
}
