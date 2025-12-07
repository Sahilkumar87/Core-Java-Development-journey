import java.util.*;
public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        int[] arr = {1,3,4,5,66, 66, 75, 99, 0, 12,};
        System.out.print("Please Enter the number you want to Searching: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("your number was found in the array");
        }
        else{
            System.out.println("your number is not found in the array");
        }
        
        
        
    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return true;
    }
    public static void greet(){
        System.out.println("Welcome to Array Searching");
    }
}
