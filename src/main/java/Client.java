import java.util.ArrayList;
import java.util.List;

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
}
