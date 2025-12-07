public class constructor {
    String color;
    int price;
    String wheel;
    static int noOfCarsSold;


    static {
        noOfCarsSold = 0;
        System.out.println("i am in static block");
    }
    {
        System.out.println("i am in init block");
    }

        constructor(){
            color = "black";
            price = 2000;
            System.out.println(color);
        }

        constructor(String color, int cost){
            this.color = color;
            price = cost;

        }


    public static void main(String[] args) {
        constructor myCar = new constructor();
        constructor car = new constructor("pink",5000);
        System.out.println(car.color);
        System.out.println(car.price); 



        

    }
}
