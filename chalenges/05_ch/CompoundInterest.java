import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest calculator");

        System.out.print("Enter your principle amount: ");
        int principle = input.nextInt();

        System.out.print("Now, tell me your rate of interest: ");
        float rate = input.nextFloat();

        System.out.print("Now, tell me for how many years are you borrowed for money");
        float years = input.nextFloat();

        double comInt = principle * Math.pow((1+rate/100), years);
        System.out.print("Your compound interest is Rs: " + comInt);


    }
    
}
