import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check odd or even");
        System.out.print("please enter your number: ");
        int num = input.nextInt();

        if(num % 2 == 1){
            System.out.println("number is odd");

        }
        else {
            System.out.println("number is even");
        }

    }
}
