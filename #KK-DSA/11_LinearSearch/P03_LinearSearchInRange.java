public class P03_LinearSearchInRange {
    public static void main(String[] args) {
        System.out.println(linearSearchInRange(new int []{0,1,2,3,4,5,6,7,8,9}, 4, 2, 8));

    }

    public static int linearSearchInRange(int[] arr, int searchvalue, int startingRange, int endingRange) {
        int foundOnIndex = -1;
        if (arr.length >= 0) {
            for (int i = startingRange; i < endingRange; i++) {
                if (arr [i] == searchvalue) {
                    return i;
                }
            }
        }             
        return foundOnIndex;
    }
}
