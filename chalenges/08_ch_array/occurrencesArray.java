import java.util.*;
public class occurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurences = noOfOccurrence(numArr, num);
        System.out.println("Your element was found " + occurences + " times in the array");

    }
    public static int noOfOccurrence(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;

        }
        return occ;
         
    }
    public static void greet(){
        System.out.println("Welcome to array occurences");
    }
}
