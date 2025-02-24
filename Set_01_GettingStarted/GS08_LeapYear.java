/*
 8. Leap year or not
 Leap year is year 
      1. divisible by 4 if its not a century year ((year % 4 == 0 && year % 100 != 0) 
      2. if the year is century year then it also divisible by 400 (year % 100 == 0 && year % 400 == 0)) 
 */

package Set_01_GettingStarted;

import java.util.Scanner;

public class GS08_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }
        sc.close();

    }

}
