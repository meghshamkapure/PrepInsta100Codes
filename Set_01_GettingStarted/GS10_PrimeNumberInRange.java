package Set_01_GettingStarted;

import java.util.Scanner;

// 10. Prime number within a given range

public class GS10_PrimeNumberInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter ending number : ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close();


    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num == 1 || num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime == true ? true : false;
    }
}
