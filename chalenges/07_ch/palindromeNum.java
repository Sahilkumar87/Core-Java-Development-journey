import java.util.*;
public class palindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter your number:"); 
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println(num + " is Palindrome");
        }
        else{
            System.out.println(num + "  is not Palindrome");
        }
        
    } 
    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }


    public static int reverse(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }

        return newNum;
    }
    public static void greet(){
        System.out.println("Welcome to PalindromeNumber \n");
    }
}
