package main.terminalhandling.operations;


public class PutOperation {
    public PutOperation(String[] command) {
        if(command[1].equalsIgnoreCase("PACKAGE")){
            System.out.println("change status");
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
