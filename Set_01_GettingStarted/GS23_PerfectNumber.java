// 23. Perfect number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS23_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;        
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i ; 
        }
        System.out.println(sum==num?"Perfect Number":"Not Perfect Number");
    }
}
 