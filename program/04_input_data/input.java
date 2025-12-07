import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("good Morning " + name);
        System.out.print(name  + ",Also tell me your age:");
        int age = input.nextInt();
        System.out.println("YOur age is: " + age);
    }
}