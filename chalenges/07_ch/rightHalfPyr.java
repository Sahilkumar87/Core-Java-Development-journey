import java.util.*;
public class rightHalfPyr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.print("Please enter the row: ");
        int num = input.nextInt();
        rightpyra(num);
        reverseRightPyra(num);
        leftHalfPyra(num);


        
    }
    public static void leftHalfPyra(int num){
        System.out.println("\nHere is the left Pyramid");
        int rows = num;
        while(rows > 0){

            int j = 0; // this loops prints spaces
            while(j < rows-1){
                System.out.print("  ");
                j++;
            }


            int i = 0; // this loop prints stars
            while(i <= num-rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

      

    public static void reverseRightPyra(int num){
        System.out.println("\nHere is the reverse right pyramid");
        int rows = num;
        while(rows > 0){
            int i = 0;
            while(i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


    public static int rightpyra(int num){
        System.out.println("\nHere is the right pyramid");
        int rows = 0;
        while(rows < num){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
        return 0;
    }
    public static void greet(){
        System.out.println("Welcome to right HALF PYRAMID\n");
    }
}
