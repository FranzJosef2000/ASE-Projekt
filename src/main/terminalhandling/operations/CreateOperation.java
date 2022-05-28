package main.terminalhandling.operations;

import main.classes.Address;
import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;
import main.package_Category;
import java.util.Scanner;

public class CreateOperation {
    private PacketEvents packetEvents;
    Scanner scanner = new Scanner(System.in);

    public CreateOperation(String[] command, PacketEventsImpl packetEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;

        if(command[1].equalsIgnoreCase("PACKAGE")){
            package_Category category = checkCategory(command[2]);
            if (category!=null) {
                System.out.println("Adressdaten des Absenders");
                Address sender = addressInput();
                boolean validSender = checkAddressInput(sender);
                System.out.println("Adressdaten des Empfängers");
                Address receiver = addressInput();
                boolean validReceiver = checkAddressInput(receiver);
                if (validReceiver && validSender) {
                    create(sender, receiver, category);
                }
            }
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
    private Address addressInput(){
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
        return new Address(firstname,lastname,zipCode,city,street,houseNumber);
    }

    private boolean checkAddressInput(Address address) {
        boolean valid = false;
        if (address.getFirstname().matches("^([A-Za-z]|[A-Za-z][-\\s])+$")) {
            if (address.getLastname().matches("^([A-Za-z]|[A-Za-z][-\\s])+$")) {
                if (address.getZipcode().matches("^[0-9]+$") && address.getZipcode().length() == 5) {
                    if (address.getCity().matches("^([A-Za-z]|[A-Za-z][-\\s]|[A-Za-z][.][\\s])+$")) {
                        if (address.getStreet().matches("^([A-Za-zß]|[A-Za-zß][-\\s]|[A-Za-zß][.][-\\s])+$")) {
                            if (address.getHouseNumber().matches("^([0-9]|[0-9][A-Za-z])+$")) {
                                valid = true;
                            }
                        }
                    }
                }
            }
        }
        return valid;
    }
    private package_Category checkCategory(String input){
        try {
            return package_Category.valueOf(input.toUpperCase());
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    private void create(Address sender, Address receiver, package_Category category){
        packetEvents.createPacket(category,sender, receiver);
    }
}
