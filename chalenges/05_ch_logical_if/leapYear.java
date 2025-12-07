import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year finder\n");
        System.out.print("Please enter your year : ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Your year is a leap year");
    }
    else {
        System.out.println("Your year is not a leap year");
    }

}
}
