import java.util.*;
public class calculateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade calculator");
        System.out.print("Please enter your persentage: ");
        float per = input.nextFloat();

        if(per >= 90){
            System.out.println("Great, you have got A");
        }
        else if(per >=75){
            System.out.println("Good, you have got B");
        }
        else if(per >= 60){
            System.out.println("you have got c, work harder next time");
        }
        else if(per >= 30){
            System.out.println("you have got D. you seriouly need to work hard");
        }
        else{
            System.out.println("Sorry, you have failed the test and got F ");
        

    }
}
}
