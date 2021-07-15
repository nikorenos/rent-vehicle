import java.math.BigDecimal;
import java.util.*;
import java.lang.*;
import java.io.*;

class Vehicle
{
    private String model;
    private BigDecimal price;
    private double weight;

    public Vehicle(String model, BigDecimal price, double weight) {
        this.model = model;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}

class Car extends Vehicle
{
    private double engineCapacity;

    public Car(double engineCapacity, String model, BigDecimal price, double weight) {
        super(model, price, weight);
        this.engineCapacity = engineCapacity;
    }
}

class Motorbike extends Vehicle
{
    private double engineCapacity;

    public Motorbike(double engineCapacity, String model, BigDecimal price, double weight) {
        super(model, price, weight);
        this.engineCapacity = engineCapacity;
    }
}

class Application {

    public static void main(String[] args) {

        Car car = new Car(2.5, "JWT", new BigDecimal("10.0"), 1000.0);
        String price = String.valueOf(car.getPrice());

        System.out.println(price);

    }
}