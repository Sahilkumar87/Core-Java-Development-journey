import java.util.*;
public class factorialNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        long fact = factNum(num);
        System.out.println("Factorial is: " + fact);
        
    }

    public static long factNum(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void greet(){
        System.out.println("Welcome to Factorial Calculator\n");
    }
}
