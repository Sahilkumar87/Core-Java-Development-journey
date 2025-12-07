import java.util.*;
public class IsSortedArray {
    public static void main(String[] args) {
        greet();
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isDecreasing(numArr);
        boolean isDec = isIncreasing(numArr);


        if(isInc || isDec){
            System.out.println("your Array is sorted");
        }
        else{
            System.out.println("your array is unsorted");
        }
    }


    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while( i < numArr.length){
            if(numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }




    public static void greet(){
        System.out.println("Welcome to Array Sorting\n");
    }
}
