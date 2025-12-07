import java.util.*;
public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("in main method");
        greeting();
        System.out.println("Method calling complete");
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();
    }
    public static void greeting(){
         System.out.println("Good Morning From KGCoding");

    }
    public static void printFirstPattern(){
         int row = 0;
         while(row < 5){
          System.out.print("*");
          int i = 0;
          while(i < row){
               System.out.print("*");
               i++;
          }
          System.out.println(" ");
          row++;
         }
    }
    public static void printSecondPattern(){
         System.out.println("        *");
         System.out.println("      * *");
         System.out.println("    * * *");
         System.out.println("  * * * *");
         System.out.println("* * * * *\n");

    }
    public static void printThirdPattern(){
         System.out.println("* * * * *");
         System.out.println("* * * *");
         System.out.println("* * *");
         System.out.println("* *");
         System.out.println("*");

    }
}
   