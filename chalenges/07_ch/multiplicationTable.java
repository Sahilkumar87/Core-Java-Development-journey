import java.util.*;
public class multiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        printTable(num);

        
          
    }
   public static void printTable(int num){
    int i = 1; 
    while ( i<=10){
        System.out.println(num + " X " + i + " = " + num*i);
        i++;
    }
        
        

    }
    public static void greet(){
        System.out.println("Welcome to Table Calculator\n");
    }
}
        