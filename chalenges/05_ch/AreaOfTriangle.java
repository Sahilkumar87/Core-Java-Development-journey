import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome Area calculator\n");
       System.out.println("Please Enter length or breadth in cm");

       System.out.print("Enter the lenght of Triangle: "); 
       double lenght = input.nextDouble();

       System.out.print("Enter the breadth of Triangle: ");
       double breadth = input.nextDouble();

       double Area = 0.5*lenght*breadth;

       System.out.println("Area : " + Area + "cms2");
    }
}
