public class P04_LinearSearchArray2D {
    public static void main(String[] args) {
        int array2D [] [] = {
            {7,4,1},
            {0,8,5,2},
            {3,9,6},
            {1,5,9,3,7,5,}
        };

        System.out.println(isExistInArray2D(array2D, 10 ));;
    }

    public static boolean isExistInArray2D (int Array2D [] [] , int searchValue){
        
        if (Array2D.length>0){
            for (int i = 0; i < Array2D.length; i++) {
                for (int j = 0; j < Array2D[i].length; j++) {
                    if (Array2D[i][j] == searchValue) {
                        return true;
                    }
                }
            }
        }

        return false;
    } 
    
}
