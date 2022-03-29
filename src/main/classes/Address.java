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
}
