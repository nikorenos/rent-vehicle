import exception.NotFoundException;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Rental {

    public Client findClientByPhone(int phoneNumber, List<Client> clientList) {
        Client foundClient;
        List<Client> foundEmployeeList = clientList.stream()
                .filter(i -> i.getPhone()==phoneNumber)
                .collect(Collectors.toList());

        if (foundEmployeeList.size()>0) {
            foundClient = foundEmployeeList.get(0);
            System.out.println("Client with phone number " + phoneNumber + ": " + foundClient.getFirstname() + " " + foundClient.getLastname());
        } else {
            throw new NotFoundException("Client with phone number " + phoneNumber + " is not found.");
        }
        return foundClient;
    }

    public void findClientWithTheMostRentals(List<Client> clientList) {
        HashMap<String, Integer> clientListWithRentals = new HashMap<>();
       for (Client client : clientList) {
           clientListWithRentals.put(client.getFirstname() + " " + client.getLastname(), client.getVehicleList().size());
       }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : clientListWithRentals.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println("Client with the most rentals: " + maxEntry.getKey() + "(" + maxEntry.getValue() + ")");
    }

    public void findHeaviestVehicle(List<Vehicle> listOfAllVehicles) {
        HashMap<String, Double> HeaviestVehicle = new HashMap<>();
        for (Vehicle vehicle : listOfAllVehicles) {
            HeaviestVehicle.put(vehicle.getModel(), vehicle.getWeight());
        }
        Map.Entry<String, Double> maxEntry = null;

        for (Map.Entry<String, Double> entry : HeaviestVehicle.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println("The heaviest vehicle: " + maxEntry.getKey() + ", Weight: " + maxEntry.getValue());
    }

    public void findLightestVehicle(List<Vehicle> listOfAllVehicles) {
        HashMap<String, Double> LightestVehicle = new HashMap<>();
        for (Vehicle vehicle : listOfAllVehicles) {
            LightestVehicle.put(vehicle.getModel(), vehicle.getWeight());
        }
        Map.Entry<String, Double> minEntry = null;

        for (Map.Entry<String, Double> entry : LightestVehicle.entrySet())
        {
            if (minEntry == null || minEntry.getValue() > entry.getValue())
            {
                minEntry = entry;
            }
        };
        System.out.println("The lightest vehicle: " + minEntry.getKey() + ", Weight: " + minEntry.getValue());

    }

    public void findMostExpensiveVehicle(List<Vehicle> listOfAllVehicles) {
        HashMap<String, BigDecimal> HeaviestVehicle = new HashMap<>();
        for (Vehicle vehicle : listOfAllVehicles) {
            HeaviestVehicle.put(vehicle.getModel(), vehicle.getPrice());
        }
        Map.Entry<String, BigDecimal> maxEntry = null;

        for (Map.Entry<String, BigDecimal> entry : HeaviestVehicle.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println("The most expensive vehicle: " + maxEntry.getKey() + ", Price: " + maxEntry.getValue());
    }

    public void findCheapestVehicle(List<Vehicle> listOfAllVehicles) {
        HashMap<String, BigDecimal> LightestVehicle = new HashMap<>();
        for (Vehicle vehicle : listOfAllVehicles) {
            LightestVehicle.put(vehicle.getModel(), vehicle.getPrice());
        }
        Map.Entry<String, BigDecimal> minEntry = null;

        for (Map.Entry<String, BigDecimal> entry : LightestVehicle.entrySet())
        {
            if (minEntry == null || minEntry.getValue().compareTo(entry.getValue()) > 0)
            {
                minEntry = entry;
            }
        }
        System.out.println("The cheapest vehicle: " + minEntry.getKey() + ", Price: " + minEntry.getValue());
    }
}
