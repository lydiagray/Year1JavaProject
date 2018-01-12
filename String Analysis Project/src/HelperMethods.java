
public class HelperMethods {
	
    public static boolean compareTwoArrays(int[] arrayOne, int[] arrayTwo) {             
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if(arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        }
        else {
        	equalOrNot = false;
        }
         
        if (equalOrNot) {
            return true;
        }
        else {
            return false;
        }
    }

}
