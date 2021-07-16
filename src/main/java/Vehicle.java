import java.math.BigDecimal;
import java.lang.*;
import java.util.List;
import java.util.stream.Collectors;

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

    public Vehicle() {

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

    public List<Vehicle> findHeaviestVehicle(List<Vehicle> listOfAllVehicles) {
        double maxValue = 0.0;
        if (listOfAllVehicles.size() > 0) {
            for (Vehicle vehicle : listOfAllVehicles) {
                if (vehicle.getWeight() >= maxValue) {
                    maxValue = vehicle.getWeight();;
                }
            }
        }

        double finalMaxValue = maxValue;
        List<Vehicle> list = listOfAllVehicles.stream()
                .filter(s -> s.getWeight() == finalMaxValue)
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }

    public List<Vehicle> findLightestVehicle(List<Vehicle> listOfAllVehicles) {
        double maxValue = Double.MAX_VALUE;
        if (listOfAllVehicles.size() > 0) {
            for (Vehicle vehicle : listOfAllVehicles) {
                if (vehicle.getWeight() <= maxValue) {
                    maxValue = vehicle.getWeight();;
                }
            }
        }

        double finalMinValue = maxValue;
        List<Vehicle> list = listOfAllVehicles.stream()
                .filter(s -> s.getWeight() == finalMinValue)
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }

    public List<Vehicle> findMostExpensiveVehicle(List<Vehicle> listOfAllVehicles) {
        BigDecimal maxValue = null;
        if (listOfAllVehicles.size() > 0) {
            for (Vehicle vehicle : listOfAllVehicles) {
                if (maxValue == null || vehicle.getPrice().compareTo(maxValue) > 0)
                {
                    maxValue = vehicle.getPrice();
                }
            }
        }

        BigDecimal finalMinValue = maxValue;
        List<Vehicle> list = listOfAllVehicles.stream()
                .filter(s -> s.getPrice().equals(finalMinValue))
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }

    public List<Vehicle> findCheapestVehicle(List<Vehicle> listOfAllVehicles) {
        BigDecimal minValue = null;
        if (listOfAllVehicles.size() > 0) {
            for (Vehicle vehicle : listOfAllVehicles) {
                if (minValue == null || minValue.compareTo(vehicle.getPrice()) > 0)
                {
                    minValue = vehicle.getPrice();
                }
            }
        }

        BigDecimal finalMinValue = minValue;
        List<Vehicle> list = listOfAllVehicles.stream()
                .filter(s -> s.getPrice().equals(finalMinValue))
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
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
