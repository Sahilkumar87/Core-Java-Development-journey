import java.util.*;
public class ageGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check age group\n");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if(age>=60){
            System.out.println("You are a senior citizen");
        }

        else if(age>=20){
            System.out.println("you are a adult");
        }
        else if(age>=13){
            System.out.println("you are a teenager");
        }
        else{
            System.out.println("you are a child");
        }
    }
}
