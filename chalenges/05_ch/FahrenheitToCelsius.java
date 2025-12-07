 import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to temperature converter ");
        System.out.print("Enter your tem in F: ");
        float fah = input.nextFloat();
        float cel = (fah-32)* 5.0f/9.0f;

        System.out.println("your temperature is: " + cel + "C");

        
    }
}
