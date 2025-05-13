import java.util.Arrays;

public class P01_LinearSerchArrays{
    public static void main(String[] args) {
        int[] arr = { 0, 14, 7, 8, 5, 23, 6, 89, 2 };
        int searchVal = 500;
        
        //search value implementation
        int foundOnIndex = linearSearch(arr, searchVal);
        System.out.println(
        foundOnIndex == -1 ?
        "Element not found" :
        "Element " + searchVal + " is found on " + foundOnIndex);

        //contains value implmentation
        System.out.println(
            "Element " + searchVal + " is present in given arr " + Arrays.toString(arr) + " is "
            + containsElement(arr, searchVal));
    }

    public static int linearSearch(int[] numArr, int searchVal) {

        int searchIndex = -1;

        if (numArr.length == 0) {
            return searchIndex;
        } else {
            for (int i = 0; i < numArr.length; i++) {
                if (numArr[i] == searchVal) {
                    return i;
                }
            }
        }
        return searchIndex;
    }

    public static boolean containsElement(int[] numArr, int searchVal) {

        if (numArr.length == 0) {
            return false;
        } else {
            for (int i: numArr) {
                if (i == searchVal) {
                    return true;
                }
            }
        }
        return false;
    }
}