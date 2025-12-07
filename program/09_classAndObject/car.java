public class car{
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;



    public car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, can not start");
        }

        else if(currentFuelInLiters > 5){
            System.out.println("Car is in reserved mode, Please refuel");
        }

        else{
            System.out.println("Car is started...bruhhhh......");
        }
        return this;
    }


    public void drive(){ 
        currentFuelInLiters--;
        System.out.println("Car is driving");
            
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}