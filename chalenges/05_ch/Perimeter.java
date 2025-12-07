import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Perimeter Calculator");
        System.out.print("Please Enter all 4 sides in cm: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double Perimeter = a+b+c+d;

        System.out.println("Perimeter of your rectangle is:" + Perimeter + "cm");
    }
}
  