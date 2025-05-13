import java.util.Scanner;

public class P02_LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        System.out.print("Enter search value : ");
        char searchChar = sc.next().charAt(0);
        
        int foundOnIndex = searchCharInString(str, searchChar);

        System.out.println(foundOnIndex==-1?"Not found":"Found On Index "+foundOnIndex);

        sc.close();
    }

    private static int searchCharInString(String str, char searchChar) {
        int foundOnIndex = -1;
        if (str.length() == 0) {
            return foundOnIndex;
        } else {
            for (int i = 0; i < str.length(); i++){ 
                if (str.charAt(i) == searchChar) {
                    return i;
                }
            }
            return foundOnIndex;
        }
    }
}