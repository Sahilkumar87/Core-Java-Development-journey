import java.util.*;
public class sumOfDigit {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int sum = sumOfdigit(num);
        System.out.println("Sum of Digit : " + sum);

        
    }

    public static int sumOfdigit(int num){
        int sum = 0;
        while( num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void greet(){
        System.out.println("Welcome to the Sum of Digit");

    }
}
