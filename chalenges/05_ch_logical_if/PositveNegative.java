import java.util.*;
public class PositveNegative{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker");
        System.out.print("Please enter your number : ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Number is positive");
        }

        else if(num == 0){
            System.out.println("number is zero");
        }
        else{
            System.out.println("number is negative");
        }

        
    }
}