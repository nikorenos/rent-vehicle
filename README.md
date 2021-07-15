# Rent Vehicle project

### 1. Project description
Project consists of client and vehicles classes in order to provide information about clients and rentals. There is also a possibility to add more different vehicles as vehicles inherit from parent Vehicle class.
Clients are described by id, firstname, lastname and phone. Parent Vehicle class contains fields model, price and weight. Child vehicle class (for example Car) have their own unique fields like engine capacity. There are also Rental class with methods described below and Demo class in order to run project with test data. 

### 2. Project methods
Main project methods are stored in Rental class:
1. findClientByPhone - method displays first and last name of a client searched by phone number as a console message by providing to method phone number with int type and list of clients.
2. findClientWithTheMostRentals - method displays first name and last name of a client with the highest amount of rentals as a console message by providing to method list of clients.
3. findHeaviestVehicle - method displays model name of the heaviest vehicle by providing to method list of all vehicles (borrowed and free).
4. findLightestVehicle - method displays model name of the lightest vehicle by providing to method list of all vehicles (borrowed and free).
5. findMostExpensiveVehicle - method displays model name of the most expensive vehicle by providing to method list of all vehicles (borrowed and free).
5. findCheapestVehicle - method displays model name of the cheapest vehicle by providing to method list of all vehicles (borrowed and free).

### 2. Demo
You can use already prepared methods usages with provided data in Demo class. You can modify data or prepare own by creating objects of clients and adding them to client list and by creating vehicles and adding them to all vehicle list (borrowed and free). Additionally, you can assign some rentals by adding vehicles to vehicle list in Client object (vehicleList).
In order to launch demo run main method in Demo class.

### 3. Requirements
Technologies used in project:
```bash
1) Java 11
2) Gradle 6.8
```

### 4. Troubleshooting
If you encounter any problems regarding operation, please let me know. 
