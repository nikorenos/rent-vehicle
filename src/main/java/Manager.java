import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    public static void main(String[] args) {
        List<Vehicle> vehicleListClient1 = new ArrayList<>();
        List<Vehicle> vehicleListClient2 = new ArrayList<>();
        List<Vehicle> vehicleListClient3 = new ArrayList<>();
        Client client1 = new Client(1, "John", "Smith", 100200300, vehicleListClient1);
        Client client2 = new Client(2, "Sara", "Johnson", 200200300, vehicleListClient2);
        Client client3 = new Client(3, "Harry", "Kane", 300200300, vehicleListClient3);
        List<Client> clientList = new ArrayList<>();
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        Car car1 = new Car(2.5, "Honda Civic", new BigDecimal("100.0"), 1000.0);
        Car car2 = new Car(1.5, "Toyota Corolla", new BigDecimal("200.0"), 2000.0);
        Car car3 = new Car(2.0, "Toyota Supra", new BigDecimal("300.0"), 2500.0);
        Car car4 = new Car(1.0, "Fiat 126p", new BigDecimal("100.0"), 500.0);
        Motorbike motorbike1 = new Motorbike(0.5, "Junak", new BigDecimal("30.0"), 500.0);
        Motorbike motorbike2 = new Motorbike(0.6, "Keeway", new BigDecimal("20.0"), 400.0);
        Motorbike motorbike3 = new Motorbike(0.7, "Romet", new BigDecimal("25.0"), 350.0);
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
        vehicleListClient3.add(motorbike3);

        Rental rental = new Rental();
        rental.findHeaviestVehicle(listOfAllVehicles);
        rental.findLightestVehicle(listOfAllVehicles);
        rental.findMostExpensiveVehicle(listOfAllVehicles);
        rental.findCheapestVehicle(listOfAllVehicles);
        rental.findClientByPhone(100200300, clientList);

        rental.findClientWithTheMostRentals(clientList);

    }
}
