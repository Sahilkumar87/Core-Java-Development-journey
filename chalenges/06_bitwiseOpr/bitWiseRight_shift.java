import java.util.*;
public class bitWiseRight_shift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to right shift");
        System.out.println("Please enter the number: ");
        int first = input.nextInt();

        int result = first >> 2;
        System.out.println("the result is: " + result);
    }
}
