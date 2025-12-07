/*
 * Create a program that takes two number and shows result of all arithmetic operator (+,-,/-*,%)
 * 
 */
import java.util.*;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to arithmetic operation");
        System.out.print("Enter value of A:");
        int a = input.nextInt();
        
        System.out.println("Now, please next number");
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int add = a + b;
        int sub = a-b;
        int div = a/b;
        int mul = a*b;
        int mod = a%b;

        System.out.println("Addition is: " + add);
        System.out.println("substaction is: " + sub);
        System.out.println("divison is: " + div);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Modulus is:" + mod);




    }
}
