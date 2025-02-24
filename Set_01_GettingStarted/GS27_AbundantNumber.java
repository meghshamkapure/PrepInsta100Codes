// 27. Abundant number 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS27_AbundantNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if (number < sumOfProperDivisor(number)) {
            System.out.println("Abundant number ");
        } 
        else {
            System.out.println("Not Abundant number ");
        }

        sc.close();

    }

    public static int sumOfProperDivisor(int number) {
        int divisiorSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i ==0){
                divisiorSum += i;
            }
        }
        return divisiorSum;
    }
}
