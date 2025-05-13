package Set_02_workingWithNumbers;

import java.util.Scanner;

public class WWN11_FindQuadrant {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the co-ordinated : ");
        
        System.out.print("X axis co-ordinated : ");
        int xCordinates = sc.nextInt();

        System.out.print("Y axis co-ordinated : ");
        int yCordinates = sc.nextInt();

        if (xCordinates>0 && yCordinates>0){
            System.out.println("Quadrant I");
        }
        
        else if (xCordinates>0 && yCordinates<0){
            System.out.println("Quadrant II");
        }
        
        else if (xCordinates<0 && yCordinates<0){
            System.out.println("Quadrant III");
        }
        
        else if (xCordinates<0 && yCordinates>0){
            System.out.println("Quadrant IV");
        }
        
        sc.close();

    }
    
}
