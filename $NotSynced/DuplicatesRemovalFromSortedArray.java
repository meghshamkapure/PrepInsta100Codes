package $NotSynced;

import java.util.Arrays;

public class DuplicatesRemovalFromSortedArray {
    public static void main(String[] args) {
        int arr []  = new int[]{1,1,2,2,3,3};
        int k=arr.length; //1,2,3,-1,-1,-1

        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]==arr[i+1]){
                    System.out.println(arr[i]+" "+arr[i+1]);
                    for (int j = i; j < k-1; j++) {
                        arr[j] = arr[j+1];
                    }
                    arr[arr.length-1]=-1;
                    k--;
                }
        }

        for (int i = 0; i <= k; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
