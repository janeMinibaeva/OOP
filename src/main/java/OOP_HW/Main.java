package OOP_HW;

import OOP_HW.Car;
import OOP_HW.Owner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("toyota",2018,2100d,"white",1.8,new Owner("Alex",29));
        Car car2 = new Car("mazda",2015,2000d,"red",1.8,new Owner("Pit",30));
        Car car3 = new Car("ford",2016,2000d,"black",1.8,new Owner("Pol",25));
        Car car4 = new Car("bmw",2010,1500d,"orange",1.8,new Owner("Tim",30));
        car1.getInfo();
        car1.toStart();
        car1.toRoad(" Moscow");
        car1.toStop();
        car1.toRoad(" Moscow");
        car2.toRoad(" Bryansk");
        car3.toRoadFruit(" mango");

        System.out.println("Speed " + car1.model + " - " + car1.getTime());
        System.out.println("Speed " + car2.model + " - " + car2.getTime());
        System.out.println("Speed " + car4.model + " - " + car4.getTime());

        Car.Finish(car1,car2,car4);

    }
}
