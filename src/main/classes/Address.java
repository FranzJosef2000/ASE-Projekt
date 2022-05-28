package main.classes;

public class Address {
    String firstname;
    String lastname;
    String zipcode;
    String city;
    String street;
    String houseNumber;

    public Address(String firstname, String lastname, String zipcode, String city, String street, String houseNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
