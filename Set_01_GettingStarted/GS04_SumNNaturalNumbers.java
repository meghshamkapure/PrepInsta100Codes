// 4. Sum of N natural numbers

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS04_SumNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number is starting from : ");
        int starting = sc.nextInt();

        System.out.print("Numbers  after starting number : ");
        int numbersAfter = sc.nextInt();

        while (numbersAfter > 0) {

            if (starting > 0) {
                System.out.print(starting + "\t");
                numbersAfter--;
            }
            starting++;
        }

        sc.close();

    }
}
