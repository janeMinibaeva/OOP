package OOP_HW;
//Доработайте программу в свободном стиле.
//        Можно сравнить 2 автомобиля между собой
//        Или пусть авто заедет за фруктами :-)
//        Добавьте несколько произвольных методов и свойств
//<br>
//ДОП: Сделать гонки:
//        - задаём растояние
//        - едут до финиша.
//        Сказать кто победит.

import java.util.Random;

public class Car {
    String model;
    int year;
    double price;
    String color;
    double power;
    boolean started;
    double speed ;
    double time;
    Owner owner;
    int distance = 2000;


    Car(String model, int year, double price, String color, double power,Owner owner) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.started = false;
        this.owner = owner;
        this.speed = new Random().nextDouble(40,131);
        this.time = 0;
    }

    public void getInfo() {
        System.out.println(model + " " + power + " " + year);
    }

    public void toStart() {
        this.started = true;
        System.out.println("Auto is started");
    }
    public void toStop() {
        this.started = false;
        System.out.println("Auto is stoped");
    }
    public void toRoadFruit(String fruit){
        System.out.println(this.model + " drive to" + fruit);
    }

    public double getTime(){
        return distance/this.speed;
    }

    public static void Finish(Car car1,Car car2,Car car3) {
        double minSpeed = Math.min(car3.getTime(),(Math.min(car1.getTime(), car2.getTime())));
        if (minSpeed ==car3.getTime() ){
            System.out.println(car3.model + " is Winner");
        }
        else if (minSpeed ==car2.getTime() ){
            System.out.println(car2.model + " is Winner");
        }
        else System.out.println(car1.model + " is Winner");
    }


        public void toRoad(String str){
        if (this.started == true){
            System.out.println( "Auto drive to" + str);
        }
        else System.out.println("Auto is not started. We can't drive");
    }
}




