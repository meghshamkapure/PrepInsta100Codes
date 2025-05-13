import java.util.Arrays;

public class LC1295_FindEvenNumDigits {
    public static void main(String[] args) {
        int nums[] = { 555, 901, 482, 1771 };
        int totalNumbers = nums.length;
        int evenNumberCount = findNumbers(nums);
        int oddNumberCount = totalNumbers - evenNumberCount;
        ;
        System.out.println(
                Arrays.toString(nums) + " has " + evenNumberCount +
                        " numbers that having even digit count and " + oddNumberCount
                        + " numbers that having odd digit count");
    }

    public static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int countDigits = countDigits(nums[i]);
            if (countDigits % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countDigits(int num) {
        int counter = 0;
        if (num != 0) {
            while (num > 0) {
                num /= 10;
                counter++;
            }
            return counter;
        }

        return 1;
    }

}