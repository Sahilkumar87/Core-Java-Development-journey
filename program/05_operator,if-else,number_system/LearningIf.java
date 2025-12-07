public class LearningIf {
    public static void main(String[] args) {

        boolean isMale = false;
        String name = "sahil";

        System.out.println("brfore if");
        if(isMale){
            System.out.println("Mr." + name);
        }
        else{
            System.out.println("Ms." + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAdult = true;
    if(isSeniorCitizen){
        System.out.println("hello Senior Citizen");
    }
    else if(isAdult){
        System.out.println("hello Adult");
    }
    else{
        System.out.println("hello child");
    }


    }
}
 