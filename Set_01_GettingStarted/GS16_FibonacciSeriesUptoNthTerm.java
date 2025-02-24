// 16. Fibonacci Series upto nth term

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS16_FibonacciSeriesUptoNthTerm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter nth term : ");
        int nthTerm = sc.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+"\t"+n2+"\t");
        for (int i = 3; i <= nthTerm; i++) {
            int sum = n1 + n2;
            System.out.print(sum+"\t");
            n1=n2;
            n2=sum;
        }   
        
        sc.close();

    }
    
}
