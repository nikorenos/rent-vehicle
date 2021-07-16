import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Vehicle> vehicleListClient1 = new ArrayList<>();
        List<Vehicle> vehicleListClient2 = new ArrayList<>();
        List<Vehicle> vehicleListClient3 = new ArrayList<>();
        Client client1 = new Client(1, "John", "Smith", 120200300, vehicleListClient1);
        Client client2 = new Client(2, "Sara", "Johnson", 100200300, vehicleListClient2);
        Client client3 = new Client(3, "Harry", "Kane", 120200300, vehicleListClient3);
        List<Client> clientList = new ArrayList<>();
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        Car car1 = new Car(2.5, "Honda Civic", new BigDecimal("100.0"), 1000.0);
        Car car2 = new Car(1.5, "Toyota Corolla", new BigDecimal("20.0"), 1500.0);
        Car car3 = new Car(2.0, "Toyota Supra", new BigDecimal("300.0"), 2500.0);
        Car car4 = new Car(1.0, "Fiat 126p", new BigDecimal("100.0"), 250.0);
        Motorbike motorbike1 = new Motorbike(0.5, "Junak", new BigDecimal("300.0"), 2500.0);
        Motorbike motorbike2 = new Motorbike(0.6, "Keeway", new BigDecimal("20.0"), 400.0);
        Motorbike motorbike3 = new Motorbike(0.7, "Romet", new BigDecimal("25.0"), 250.0);
        List<Vehicle> listOfAllVehicles = new ArrayList<>();
        listOfAllVehicles.add(car1);
        listOfAllVehicles.add(car2);
        listOfAllVehicles.add(car3);
        listOfAllVehicles.add(car4);
        listOfAllVehicles.add(motorbike1);
        listOfAllVehicles.add(motorbike2);
        listOfAllVehicles.add(motorbike3);

        vehicleListClient1.add(car1);
        vehicleListClient2.add(car2);
        vehicleListClient2.add(motorbike1);
        vehicleListClient3.add(car3);
        vehicleListClient3.add(motorbike2);

        Vehicle vehicle = new Vehicle();
        Client client = new Client();
        vehicle.findHeaviestVehicle(listOfAllVehicles);
        vehicle.findLightestVehicle(listOfAllVehicles);
        vehicle.findCheapestVehicle(listOfAllVehicles);
        vehicle.findMostExpensiveVehicle(listOfAllVehicles);
        System.out.println(client.findClientByPhone(120200300, clientList));
        client.findClientWithTheMostRentals(clientList);

    }
}
