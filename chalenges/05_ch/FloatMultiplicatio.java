import java.util.*;
public class FloatMultiplicatio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        double first = input.nextDouble();
        
        System.out.print("Now, please Entet second number: ");
        double second = input.nextDouble();

        System.out.println("\nFloat Multiplication....");

        double result = first * second;
        System.out.println("resutl is: " + result);

    }
}
