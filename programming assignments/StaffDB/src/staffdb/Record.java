/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffdb;


public class Record {
    private int id;
    private String lastName;
    private String firstName;
    private String mi;
    private String address;
    private String city;
    private String state;
    private int telephone;
    private String email;
    
    
    // constructor for db
    public Record(int id, String lastName, String firstName, String mi, String address, String city, String state, int telephone, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.mi = mi;
        this.address = address;
        this.city = city;
        this.state = state;
        this.telephone = telephone;
        this.email = email;
    }
    
    // constructor for java
    public Record(String lastName, String firstName, String mi, String address, String city, String state, int telephone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mi = mi;
        this.address = address;
        this.city = city;
        this.state = state;
        this.telephone = telephone;
        this.email = email;
    }
    // getters
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMi() {
        return mi;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    
    // setters
    
    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
