import java.util.*;
public class bitWiseLeft_shift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to left shift\n");
        System.out.print("Please enter the number: ");
        int first = input.nextInt();

        int result = first << 4;
        System.out.print("Your result is: " + result);
    }
}
