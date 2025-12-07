import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter the number: ");
        int first = input.nextInt();
        boolean isprime = isPrime(first);
        if(isprime){
            System.out.println("number is  prime");
        }
        else{
            System.out.println("number is not  prime");
        }



        
    }
    public static boolean isPrime(int num){
        int i = 2; 
        while(i < num){
            if(num%i == 0){
            return false;
        }
         i++;
      
    }
      return true;
}
    public static void greet(){
        System.out.println("Welcome to the Prime Calculator\n");

    }
}
