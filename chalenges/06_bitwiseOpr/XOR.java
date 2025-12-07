import java.util.*;
public class XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to XOR operator\n");
       
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("enter the second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result is: " + result);
        
    }
    
}