import java.util.*;
public class bitWiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwwise OR oerator");
        System.out.print("please enter the first number:");
        int first = input.nextInt();
        System.out.print("Now, enter the second number:");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("the result is : " + result);
    }
}
