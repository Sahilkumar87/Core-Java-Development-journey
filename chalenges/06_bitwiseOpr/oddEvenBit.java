import java.util.*;
public class oddEvenBit {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to check odd evem with bitwise operator\n"); 
       System.out.print("please enter your number: ");
       int num = input.nextInt();

       if((num & 1) == 1){
        System.out.println(num + " is odd");
       }
       else{
        System.out.println(num + " is even");
       }
    }
}
