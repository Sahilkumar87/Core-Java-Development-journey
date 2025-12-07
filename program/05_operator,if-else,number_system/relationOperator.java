import java.util.*;
public class relationOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving Licenssse Portal");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();


        if(age >= 18){
            System.out.println("your are eligible to drive");

        }
        else{
            System.out.println("You are not eligible to Drive, beta cycle chalao");
        }
    }
}
