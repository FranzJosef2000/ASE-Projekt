package main.terminalhandling.operations;


import main.interfaces.EmployeeEvents;
import main.interfaces.EmployeeEventsImpl;
import main.interfaces.PacketEvents;
import main.interfaces.PacketEventsImpl;

import java.util.Scanner;

public class PutOperation {
    private PacketEvents packetEvents;
    private EmployeeEvents employeeEvents;
    Scanner scanner = new Scanner(System.in);

    public PutOperation(String[] command, PacketEventsImpl packetEventsImpl, EmployeeEventsImpl employeeEventsImpl) {
        super();
        this.packetEvents = packetEventsImpl;
        this.employeeEvents = employeeEventsImpl;
        if (authorize()){
            if(command[1].equalsIgnoreCase("PACKAGE")){

                if (command[2].length() == 36){
                    String trackingNumber = command[2];
                    packetEvents.changeState(trackingNumber);
                }
                else{
                    System.out.println("Fehlerhafte Eingabe");
                }
            }
            else{
                System.out.println("Fehlerhafte eingabe!");
            }
        }
    }
    private boolean authorize(){
        System.out.print("Angestellten ID: ");
        String ID = scanner.nextLine();
        System.out.print("Passwort: ");
        String password = scanner.nextLine();
        return employeeEvents.Authorize(ID,password);
    }
}
