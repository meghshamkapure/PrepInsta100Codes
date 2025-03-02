//Hexadecimal to Decimal Conversion  
//Converts a hexadecimal number (base 16) into a decimal number (base 10). 

package Set_02_workingWithNumbers;

import java.util.*;

public class WWN05_HexadecimalToDecimal{
    public static void main (String args []){
        Scanner sc  = new Scanner (System.in);
       
        System.out.print("Enter number to be converted from Hexadecimal to Decimal : ");
       
        String hexNum = sc.nextLine();
         int decimalNumber = 0 ;
       
        int [] hexNumArray = hexCharsToNums(hexNum);
       if (hexNumArray!=null){
       
        for(int i =0; i< hexNumArray.length; i++){
            decimalNumber = decimalNumber + (hexNumArray[i] * (int) Math.pow(16,hexNumArray.length-i-1));    
        }
       
        System.out.println("HEXADECIMAL ["+hexNum+"] : DECIMAL ["+decimalNumber+"]");
       }else{
           System.out.println("INVALID HEX VALUE");
       }
       
       sc.close();
    }
   
    public static int [] hexCharsToNums (String hex){
        int hexNumArray []  = new int [hex.length()];
        for (int i = 0; i<hex.length() ; i++ ){
           
            // 0-9: ASCII 48-57            
            if(hex.charAt(i)>=48 && hex.charAt(i)<=57){
                hexNumArray[i]=hex.charAt(i)-48;
            }
           
            // a-z: ASCII 97-122
             else if(hex.charAt(i)>=97 && hex.charAt(i)<=102){
                hexNumArray[i]=hex.charAt(i)-86;
            }
           
            // A-Z: ASCII 65-90
             else if(hex.charAt(i)>=65 && hex.charAt(i)<=70){
                hexNumArray[i]=hex.charAt(i)-54;
            }
           
            else{
                return null;
            }
        }
         return hexNumArray;
       
    }
}