import java.util.*;
public class bitWiseNOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to NOT operator");
        System.out.print("Please enter the number: ");
        int first = input.nextInt();

        int result = ~first;
        System.out.println("the result is: " + result);

    }
}
