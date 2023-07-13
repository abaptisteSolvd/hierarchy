package implementations;

import abstracts.Animal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlRootElement(name = "owner")
@XmlType(propOrder = { "id", "name", "address" })
public class Owner {
    ArrayList<Animal> pets = new ArrayList<Animal>();
    private int id;
    private String name;
    private String address;

    public Owner(int id) {
        this.id = id;
    }

    @XmlAttribute
    public void setID(int newID) {
        id = newID;
    }
    public int getID() {
        return id;
    }

    @XmlElement(name = "name")
    public Owner setName(String newName) {
        name = newName;
        return this;
    }
    public String getName() {
        return name;
    }

    @XmlElement(name = "address")
    public Owner setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress(){
        return address;
    }
}
