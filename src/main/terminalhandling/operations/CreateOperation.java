package main.terminalhandling.operations;

import java.util.Scanner;

public class CreateOperation {
    Scanner scanner = new Scanner(System.in);

    public CreateOperation(String[] command) {
        if(command[1].equalsIgnoreCase("PACKAGE")){
            System.out.println("Adressdaten des Absenders");
            System.out.print("Vorname: ");
            String firstname = scanner.nextLine();
            System.out.print("Nachname: ");
            String lastname = scanner.nextLine();
            System.out.print("Postleitzahl: ");
            String zipCode = scanner.nextLine();
            System.out.print("Stadt: ");
            String city = scanner.nextLine();
            System.out.print("Straße: ");
            String street = scanner.nextLine();
            System.out.print("Hausnummer: ");
            String houseNumber = scanner.nextLine();
            checkInput(firstname, lastname, zipCode, city, street, houseNumber);
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
    private void checkInput(String firstname, String lastname, String zipCode, String city, String street, String houseNumber) {
        if (firstname.matches("^([A-Za-z]|[A-Za-z][-\\s])+$")) {
            System.out.println("Vorname");
            if (lastname.matches("^([A-Za-z]|[A-Za-z][-\\s])+$")) {
                System.out.println("Nachname");
                if (zipCode.matches("^[0-9]+$") && zipCode.length() == 5) {
                    System.out.println("Postleitzahl");
                    if (city.matches("^([A-Za-z]|[A-Za-z][-\\s]|[A-Za-z][.][\\s])+$")) {
                        System.out.println("Stadt");
                        if (street.matches("^([A-Za-zß]|[A-Za-zß][-\\s]|[A-Za-zß][.][-\\s])+$")) {
                            System.out.println("Straße");
                            if (houseNumber.matches("^([0-9]|[0-9][A-Za-z])+$")) {
                                System.out.println("Hausnummer");
                                create(firstname,lastname,zipCode,city,street,houseNumber);
                            }
                        }
                    }
                }
            }
        }
    }

    private void create(String firstname, String lastname, String zipCode, String city, String street, String houseNumber){
        System.out.println("Interface Aufruf");
    }
}
