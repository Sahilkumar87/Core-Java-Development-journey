import java.util.*;
public class bitWiseAND {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to bitwise AND");
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter sencond number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.print("result is : " + result);


    }
}