import java.util.*;
public class DeleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter then number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.print("Here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = occurrencesArray.noOfOccurrence(numArr, numToDelete);
        if(occ == 0){
            return numArr;
        }

        int newSize = numArr.length-occ;
        int[] newArr = new int[newSize];

        int i = 0 , j = 0;
        while(i < numArr.length){
            if(newArr[i] != numToDelete){
                newArr[j] = newArr[i];
                j++;
            }
            i++;
        }
        return numArr;

 
    }

    public static void greet(){
        System.out.println("Welcome to Array Deletion");
    }

    
}
