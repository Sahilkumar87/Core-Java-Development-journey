import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.print("your number is Armstrong");
        }
        else{
            System.out.println("your number is not Armstrong");
        }
       
        
    }

    
    public static boolean isArmstrong(int num){
        int noOfDigit = noOfDigits(num);
        int numCopy = num;
        System.out.println("no of digits: " + noOfDigit);
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num /=10;
            finalNumber += power(lastDigit, noOfDigit);
        }
        return finalNumber == numCopy;
    }

    public static int power(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;

    }


    public static int noOfDigits(int num){
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }


    public static void greet(){
        System.out.println("Welcome to Armstrong Number\n");
    }
}
