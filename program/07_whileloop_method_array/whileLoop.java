import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = 1; // initailization
        // while(num <=1000){ // condition
        //     System.out.println(num + ". I LOVE YOU");
        //     num +=1; // updating the condition

            int count = 500;
            while(count >= 200){
                System.out.println(count);
                count -=1;
            }

            int i = 0;
            while(i<5){
                System.out.println("number is : " + i);
                i +=1;
            }
        }
    }

