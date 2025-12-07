import java.util.*;

public class driver {

    static int minAgeForDriving = 19;
    String name;
    String dateOfLicence;

    public static void main(String[] args) {
        // car myCar = new car();
        // myCar.addFuel(8);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());
        car audi = new car();
        audi.addFuel(9);
        audi.start().drive();
        driver myDriver = new driver();
        myDriver.dateOfLicence = "1./jan/2025";
        System.out.println(myDriver.minAgeForDriving);
    }

}
