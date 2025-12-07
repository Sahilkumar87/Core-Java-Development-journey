import java.util.*;
public class parameterFunction {
    public static void main(String[] args) {
        int num = sumTwoNumber(4, 7);
        System.out.println(num);
        
    }
    public static int sumTwoNumber(int first, int second){
        System.out.println("First Number received: " + first);
        System.out.println("Second Number received: " + second);
        int sum = first + second;
        return sum;
    }
}
