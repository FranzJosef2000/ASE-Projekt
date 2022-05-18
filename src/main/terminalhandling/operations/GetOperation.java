package main.terminalhandling.operations;

public class GetOperation {
    public GetOperation(String[] command) {
        if(command[1].equalsIgnoreCase("PACKAGE")){
            System.out.println("get Package");
        }
        else{
            System.out.println("Fehlerhafte eingabe!");
        }
    }
}
