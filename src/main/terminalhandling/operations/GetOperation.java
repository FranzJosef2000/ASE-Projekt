package main.terminalhandling.operations;

import java.util.Scanner;

public class GetOperation {

    public GetOperation(String[] command) {
        if(command[1].equalsIgnoreCase("PACKAGE")){
            if (command[2].length() == 8)
            {
                String packageNumber = command[2];
                System.out.println("Get Interface");
            }
            else {
                System.out.println("Fehlerhafte Eingabe");
            }
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
