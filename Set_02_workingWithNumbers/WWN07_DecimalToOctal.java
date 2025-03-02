/* 
Decimal to Octal Conversion
Converts a decimal number (base 10) into an octal number (base 8).
*/

package Set_02_workingWithNumbers;
import java.util.*;

public class WWN07_DecimalToOctal{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	    System.out.print("Enter the number : ");
	    int decimalNumber = sc.nextInt();
        int numCopy = decimalNumber;
        int remainder = 0;
        int octalNumber = 0;
        int x = 1;
        
        while (numCopy>0){
            remainder = numCopy % 8;
            octalNumber = octalNumber +( remainder * x );
            x *=10;
            numCopy/=8;
            
        }
        System.out.println("DECIMAL [ "+decimalNumber+" ] = OCTAL [ "+octalNumber+" ] ");
   
	}
}