# Rent Vehicle project

### 1. Project description
Project consists of client and vehicles classes in order to provide information about clients and rentals. There is also a possibility to add more different vehicles as vehicles inherit from parent Vehicle class.
Clients are described by id, firstname, lastname and phone. Parent Vehicle class contains fields model, price and weight. Child vehicle class (for example Car) have their own unique fields like engine capacity. There is also Demo class in order to run project with test data. 

### 2. Project methods
Client class:
1. findClientByPhone - method returns client list with searched phone number by providing to method phone number with int type and list of clients.
2. findClientWithTheMostRentals - method returns client list with the highest amount of rentals by providing to method list of clients.
   
Vehicle class:
3. findHeaviestVehicle - method returns list of the heaviest vehicles by providing to method list of all vehicles (borrowed and free).
4. findLightestVehicle - method returns list of the lightest vehicles by providing to method list of all vehicles (borrowed and free).
5. findMostExpensiveVehicle - method returns list of the most expensive vehicles by providing to method list of all vehicles (borrowed and free).
5. findCheapestVehicle - method returns list of the cheapest vehicles by providing to method list of all vehicles (borrowed and free).

### 3. Demo
You can use already prepared methods usages with provided data in Demo class. You can modify data or prepare own by creating objects of clients and adding them to client list and by creating vehicles and adding them to all vehicle list (borrowed and free). Additionally, you can assign some rentals by adding vehicles to vehicle list in Client object (vehicleList).
In order to launch demo run main method in Demo class.

### 4. Requirements
Technologies used in project:
```bash
1) Java 11
2) Gradle 6.8
```

### 5. Troubleshooting
If you encounter any problems regarding operation, please let me know. 
