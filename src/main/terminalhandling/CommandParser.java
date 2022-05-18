package main.terminalhandling;

import main.terminalhandling.operations.CreateOperation;
import main.terminalhandling.operations.GetOperation;
import main.terminalhandling.operations.PutOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandParser {
    private int POSITION = 0;
    public CommandParser() {}

    public void execute(String[] command){
        if (command[POSITION].equalsIgnoreCase("CREATE")){
            new CreateOperation(command);
        }
        else if (command[POSITION].equalsIgnoreCase("PUT")){
            new PutOperation(command);
        }
        else if (command[POSITION].equalsIgnoreCase("GET")){
            new GetOperation(command);
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
