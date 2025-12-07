import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);
        greet();
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacii Series");
        pritfibo(num);

        
    }
    public static void pritfibo(int num){
        if(num < 0) return;
         System.out.println("0 ");
        if(num == 0) return;
        System.out.println("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
    public static void greet(){
        System.out.println("Welcome to fibonnacii series\n");
    }
}
