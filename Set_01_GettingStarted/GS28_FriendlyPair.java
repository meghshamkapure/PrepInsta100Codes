// 28. Friendly pair 

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS28_FriendlyPair {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();

        if (abundancyIndex(number1)==abundancyIndex(number2))
            System.out.println("Friendly pair ");
        else
            System.out.println("Not Friendly pair ");
    }   

    public static int abundancyIndex (int num){
        System.out.println(sumOfProperDivisor(num) / num);
        return sumOfProperDivisor(num) / num;
    }
    
    public static int sumOfProperDivisor(int num) {
        int divisiorSum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i ==0){
                divisiorSum += i;
            }
        }

        return divisiorSum;
    }   
}
