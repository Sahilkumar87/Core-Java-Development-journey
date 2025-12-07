import java.util.*;
public class returnStatementFunction {
    public static void main(String[] args) {
        greet();
        int first = readNum();
        int second = readNum();

        int sum = first + second;
        System.out.println("Sum is: " + sum);
      
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        return num;
    }
    public static void greet(){
        System.out.println("Welcome to Calculator\n");
    }


}
