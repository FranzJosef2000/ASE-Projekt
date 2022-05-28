package main.terminalhandling;

import main.interfaces.EmployeeEventsImpl;
import main.interfaces.PacketEventsImpl;
import main.terminalhandling.operations.CreateOperation;
import main.terminalhandling.operations.GetOperation;
import main.terminalhandling.operations.HelpOperation;
import main.terminalhandling.operations.PutOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandParser {
    private int POSITION = 0;
    public CommandParser() {}

    public void execute(String[] command, PacketEventsImpl packetEventsImpl, EmployeeEventsImpl employeeEventsImpl){
        if (command[POSITION].equalsIgnoreCase("CREATE")){
            new CreateOperation(command, packetEventsImpl);

        }
        else if (command[POSITION].equalsIgnoreCase("PUT")){
            new PutOperation(command, packetEventsImpl, employeeEventsImpl);
        }
        else if (command[POSITION].equalsIgnoreCase("GET")){
            new GetOperation(command, packetEventsImpl);
        }
        else if (command[POSITION].equalsIgnoreCase("HELP")){
            new HelpOperation(command, packetEventsImpl);
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
