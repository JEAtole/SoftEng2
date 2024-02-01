
public class CarTest {
    public static void main(String[] args){

        Car myCar = new Car.CarBuilder()
            .transmission("Automatic")
            .color("Violet")
            .engineType("Diesel")
            .capacity(4)
            .brand("Mercedes - Benz")
            .build();
        
        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car engine type: " + myCar.getEngineType());
        System.out.println("Car transmission: " + myCar.getTransmission());
        System.out.println("Car color: " + myCar.getColor());
        System.out.println("Car capacity: " + myCar.getCapacity());

    }
}

