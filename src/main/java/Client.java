import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    private int id;
    private String firstname;
    private String lastname;
    private int phone;
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Client(int id, String firstname, String lastname, int phone, List<Vehicle> vehicleList) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.vehicleList = vehicleList;
    }
    public Client() {

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", vehicleList=" + vehicleList +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhone() {
        return phone;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public List<Client> findClientByPhone(int phoneNumber, List<Client> clientList) {
        return clientList.stream()
                .filter(i -> i.getPhone()==phoneNumber)
                .collect(Collectors.toList());
    }

    public List<Client> findClientWithTheMostRentals(List<Client> clientList) {
        int maxValue = 0;
        if (clientList.size() > 0) {
            for (Client client : clientList) {
                if (client.getVehicleList().size() >= maxValue) {
                    maxValue = client.getVehicleList().size();
                }
            }
        }

        int finalMaxValue = maxValue;
        List<Client> list = clientList.stream()
                .filter(s -> s.getVehicleList().size() == finalMaxValue)
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }
}
