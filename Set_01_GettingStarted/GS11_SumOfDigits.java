// 11. Sum of digits of a number

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS11_SumOfDigits {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number : ");
    int num = scanner.nextInt();
    int sum=0;

    if (num<0) num=0-num;
    
    while (num>0) {
        sum+=num%10;
        num/=10;
    }

    System.out.println(sum);
}    
}
