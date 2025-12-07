import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int second = input.nextInt();
        int lcm = LcmNum(first, second);
        System.out.print("Lcm of the two number is: " + lcm);

        
        
    }

    public static int LcmNum(int first, int second){
        int i = 1;
        while(true){
            int factor = first * i;
            if(factor%second == 0){
                return factor;
            }
            i++;
        }
    }
    public static void greet(){
        System.out.println("Welcome to LCM Calculator\n");
    }

    
}