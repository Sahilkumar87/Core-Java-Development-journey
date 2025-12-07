import java.util.*;
public class addTwoNo {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.print("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, Please enter the second number: ");
        int secNum = input.nextInt();
        int sum = firstNum + secNum;
        System.out.println("Sum of your number is: " + sum);


    }
}
