import java.util.*;
public class array {

    public static void main(String[] args) {
        /*
        1. array;- an array is just a list of value.
        2. index;- starts with 0 
        3. array are used for storing multiple valu in a single variable; 
           */
        Scanner input = new Scanner(System.in);
        greet();
        // int[] myArr = new int[5];
        // myArr[0] = 1;
        // myArr[1] = 2;
        // myArr[2] = 3;
        // myArr[3] = 4;
        // myArr[4] = 5;

        int[] myArr = {1,2,3,4,5};
      

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[index]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);
        // Array Traversal
          int index = 0;
          while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
          }


          String[] strArr = new String[4];
          strArr[0] = "My String";

          String[] newStrArr = {"sahil", "chandan", "sneha"};
          System.out.println( "the lenght of StringArray: " + newStrArr.length);
          


          



        
    }

    public static void greet(){
        System.out.println("Welcome to ARRAY ");
    }
}



